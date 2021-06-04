package subtask1

import java.text.SimpleDateFormat
import java.time.Year
import java.util.*

//fun main(args: Array<String>) {
class DateFormatter {



    fun toTextDay(day: String, month: String, year: String): String {
        var result = "Такого дня не существует"
        if (day.toInt() > 31 || month.toInt() > 12) {
            return result
        } else {
            val dateFormat = SimpleDateFormat("d MMMM, EEEE")
            val calendar: Calendar = GregorianCalendar(year.toInt(), month.toInt() - 1, day.toInt())
            result = dateFormat.format(calendar.time)
        }

        return result
    }
}


