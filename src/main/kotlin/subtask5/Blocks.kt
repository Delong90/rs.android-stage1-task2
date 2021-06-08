package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

fun main(args:Array<String>) {
var blocks = Blocks()
    println(blocks.getData(arrayOf(1, "4", 2, "3"), Int::class))

 }



class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        var sumString = ""
        var sumInt = 0
        var maxDate:LocalDate = LocalDate.MIN
        var formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        when (blockB) {
                String::class -> {
                    for (element in blockA) {
                        if (element is String) {
                            sumString += element
                        }
                    }
                    return sumString
                }
                Int::class ->{
                    for (element in blockA) {
                        if (element is Int) {
                            sumInt += element
                        }
                    }
                    return sumInt
                }
                else -> {for (element in blockA) {
                    if (element is LocalDate) {
                        if (element>maxDate) {maxDate = element}
                    }
                }
                    return maxDate.format(formatter)

                }
        }
    }
}




