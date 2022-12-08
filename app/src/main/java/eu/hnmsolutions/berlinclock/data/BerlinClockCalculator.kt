package eu.hnmsolutions.berlinclock.data

class BerlinClockCalculator {

    fun getHours(hours: Int): String {
        val numberTopHourLamps = hours / 5
        val numberBottomHourLamps = hours % 5
        val sb = StringBuilder()
        sb.append(getLampRow(numberTopHourLamps, "R"))
            .append(" ")
            .append(getLampRow(numberBottomHourLamps, "R"))
        return sb.toString()
    }

    fun getMinutes(minutes: Int): String {
        val numberTopMinutesLamps = minutes / 5
        val numberBottomMinutesLamps = minutes % 5
        val sb = StringBuilder()
        for (i in 1..11) {
            sb.append(if (i <= numberTopMinutesLamps) getMinuteLampColour(i) else "O")
        }
        sb.append(" ")
        sb.append(getLampRow(numberBottomMinutesLamps, "Y"))
        return sb.toString()
    }

    fun getSeconds(seconds: Int): String {
        return if (seconds % 2 == 0) "Y" else "O"
    }

    fun berlinClock(hours: Int, minutes: Int, seconds: Int): String {
        return getSeconds(seconds) + " " + getHours(hours) + " " + getMinutes(minutes)
    }

    private fun getLampRow(numberLampsOn: Int, lampSymbol: String): String {
        val sb = StringBuilder()
        for (i in 1..4) {
            sb.append(if (i <= numberLampsOn) lampSymbol else "O")
        }
        return sb.toString()
    }

    private fun getMinuteLampColour(index: Int): String {
        return if (index % 3 == 0) "R" else "Y"
    }

}