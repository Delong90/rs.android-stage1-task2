package subtask4


fun main(args:Array<String>) {
    var pangram = Pangram()
    println(pangram.getResult("Sphinx of black quartz, judge my vow."))
}

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        var result = ""
        var inputStringPangram = false
        var charKonteiner = 'A'
        var index = 0
        while (charKonteiner <= 'Z') {
            if (inputString.contains(charKonteiner, true)) {
                index++
            }
            charKonteiner++
        }
        if (index==26) inputStringPangram = true

        return result

    }
}
