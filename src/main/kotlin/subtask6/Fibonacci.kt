package subtask6


//fun main(args:Array<String>) {
//    var fibonacci = Fibonacci()
//    println(fibonacci.productFibonacciSequenceFor(40))
//}

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var fibonacciList = mutableListOf(0,1)
        var i = 0
        var j = 0
        var intArray:IntArray = intArrayOf(0,0,0)
        while (i==j){
            var multiplication = fibonacciList[i]*fibonacciList[i+1]
            if (n>multiplication){
                fibonacciList.add(fibonacciList[i]+fibonacciList[i+1])
                i++
                j++
            }else {
                j++
            }
        }
        intArray[0]=fibonacciList[i]
        intArray[1]=fibonacciList[i+1]
        if (fibonacciList[i]*fibonacciList[i+1] == n){intArray[2] = 1}
        else{intArray[2] = 0}
    return intArray
    }
}
