package com.ozioma.util

import java.util.*

object DateTimeUtil {
    var timezone = TimeZone.getTimeZone("Asia/Bangkok")
    val currentTime = GregorianCalendar().time.time

    val tenAmCurrentDay =
        GregorianCalendar(getCurrentYear(), getCurrentMonth(), getCurrentDayOfMonth(), 8, 36).time.time

    private fun getCurrentYear(): Int {
        val calendar = Calendar.getInstance(timezone)
        calendar.time = Date()
        return calendar.get(Calendar.YEAR)
    }

    private fun getCurrentMonth(): Int {
        val calendar = Calendar.getInstance(timezone)
        calendar.time = Date()
        return calendar.get(Calendar.MONTH)
    }

    private fun getCurrentDayOfMonth(): Int {
        val calendar = Calendar.getInstance(timezone)
        calendar.time = Date()
        return calendar.get(Calendar.DAY_OF_MONTH)
    }
}