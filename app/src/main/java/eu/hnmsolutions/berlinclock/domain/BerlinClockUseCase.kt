package eu.hnmsolutions.berlinclock.domain

import javax.inject.Inject

class BerlinClockUseCase @Inject constructor(private val berlinClockCalculator: IBerlinClockCalculator) {

    fun berlinClock(hours: Int, minutes: Int, seconds: Int): String {
        return berlinClockCalculator.berlinClock(hours, minutes, seconds)
    }
}
