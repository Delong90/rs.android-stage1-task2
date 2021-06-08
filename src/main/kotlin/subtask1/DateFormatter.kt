
package subtask1


import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


class DateFormatter {



    fun toTextDay(day: String, month: String, year: String): String {
        var result = "Такого дня не существует"
        var formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE")
        try { result = LocalDate.of(year.toInt(),month.toInt(),day.toInt()).format(formatter.withLocale(
            Locale.forLanguageTag("Ru")))

        }
        finally {
            return result
        }
    }
}


