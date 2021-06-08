package subtask2


class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        var result = ""
        val minuteList = arrayOf(
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one",
            "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine"
        )

        if (minute.toInt() in 0..59 && hour.toInt() in 0..12){
        when(minute.toInt()){
            0 -> result = "${minuteList[hour.toInt()]} o' clock"
            in 1..14 -> result = "${minuteList[minute.toInt()]} minutes past ${minuteList[hour.toInt()]}"
            15 -> result = "quarter past ${minuteList[hour.toInt()]}"
            30 -> result = "half past ${minuteList[hour.toInt()]}"
            in 31..44 -> result = "${minuteList[60-minute.toInt()]} minutes to ${minuteList[hour.toInt()+1]}"
            45 -> result = "quarter to ${minuteList[hour.toInt()+1]}"
            in 46..59 -> result = "${minuteList[60-minute.toInt()]} minutes to ${minuteList[hour.toInt()+1]}"
        }}
        return result

    }
}
