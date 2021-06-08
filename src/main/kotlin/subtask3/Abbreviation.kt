package subtask3

import java.util.*
fun main(args:Array<String>) {
    var test:Abbreviation = Abbreviation()
    println(test.abbreviationFromA("ytrewq","RY"))

}



class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var result = "NO"
        val splitAbbreviationA = a.toUpperCase().split("")
        val splitAbbreviationB = b.split("")
        var i = 1
        var j = 1
        var index = 0


        while (i<=a.length){
        if (splitAbbreviationB[j] == splitAbbreviationA[i]){
                j++
                index++
            }
                i++
        }
        if (index == b.length) {result = "YES"}
        return result

    }
}



//while (j<=b.length){
//    if (splitAbbreviationB[j] in splitAbbreviationA){
//        if ((splitAbbreviationA.indexOf(splitAbbreviationB[j])-index)>0) {
//            index = splitAbbreviationA.indexOf(splitAbbreviationB[j])
//            i++
//            j++
//        }else {j++}
//    }else {j++}
//}
//if (i-1 == b.length) {result = "YES"}
//return result