package subtask4


//fun main(args:Array<String>) {
//    var pangram = Pangram()
//    println(pangram.getResult("asdasdasdasda \n" +
//            "                            sdasdadasd sadasdasdas \n" +
//            "                            sadadad  "))
//    println("4SaDaDaD 7SDaSDaDaSD 7SaDaSDaSDaS 8aSDaSDaSDaSDa")
//
//    val regular = Regex("\\s{2,}+")
//    var test = "   "
//    val listWords = test.replace(regular, " ").split(' ').filter { it.isNotEmpty() }
//    println("+$listWords+")
//
//}

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        var result = ""
        var inputStringPangram = false
        var charKonteiner = 'A'
        var index = 0
        val regular = Regex("\\s{2,}+")
        val listWords = inputString.replace(regular, " ").split(' ').filter { it.isNotEmpty() }
        val newListWords= mutableListOf<Pair<Int,String>>()
//        listWord.forEach { i -> println(i) }
//        println(listWord.toString())

        while (charKonteiner <= 'Z') {
            if (inputString.contains(charKonteiner, true)) {
                index++
            }
            charKonteiner++
        }
        if (index==26) inputStringPangram = true



        if (inputStringPangram) {
            for (i in listWords) {
                newListWords.add(newWordPangram(i))
            }
            newListWords.sortBy { it.first }
            result = newListWords.joinToString(" ") { it.second }
        } else{
            for (i in listWords) {
                newListWords.add(newWordNotPangram(i))
            }
            newListWords.sortBy { it.first }
            result = newListWords.joinToString(" ") { it.second }
        }


        return result
    }
}



fun newWordPangram(string: String):Pair<Int,String>{
    var newWord = ""
    var i = 0
    val vowelsList = listOf('a','e','i','o','u','y')
    for (char in string){
        if (char.toLowerCase() in vowelsList){
            i++
            newWord += char.toUpperCase().toString()
        }
        else {
            newWord += char.toString()
        }
    }
    return Pair(i,"$i$newWord")
}



fun newWordNotPangram(string: String):Pair<Int,String> {
    var newWord = ""
    var i = 0
    val vowelsList = listOf('a','e','i','o','u','y')
    for (char in string){
        if (char.toLowerCase() in 'a'..'z') {
            if (char.toLowerCase() in vowelsList) {
                newWord += char.toString()
            } else {
                i++
                newWord += char.toUpperCase().toString()
            }
        } else{
            newWord += char.toString()
        }


    }

    return Pair(i,"$i$newWord")
}


