package eu.hnmsolutions.berlinclock.domain

interface IBerlinClockCalculator {

    fun berlinClock(hours: Int, minutes: Int, seconds: Int): String

}