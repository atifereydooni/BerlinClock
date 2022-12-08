package eu.hnmsolutions.berlinclock.data

import org.junit.Assert.*

import org.junit.Test

class BerlinClockCalculatorTest {

    private val berlinClockCalculator = BerlinClockCalculator()

    @Test
    fun testBerlinClock() {
        assertEquals("O RROO RRRO YYROOOOOOOO YYOO", berlinClockCalculator.berlinClock(13, 17, 1))
        assertEquals("Y RRRR RRRO YYRYYROOOOO YYYY", berlinClockCalculator.berlinClock(23, 34, 42))
    }

    @Test
    fun testSeconds() {
        assertEquals("Y", berlinClockCalculator.getSeconds(0))
        assertEquals("O", berlinClockCalculator.getSeconds(1))
        assertEquals("Y", berlinClockCalculator.getSeconds(42))
        assertEquals("O", berlinClockCalculator.getSeconds(59))
    }

    @Test
    fun testHours() {
        assertEquals("OOOO OOOO", berlinClockCalculator.getHours(0))
        assertEquals("RROO RRRO", berlinClockCalculator.getHours(13))
        assertEquals("RRRR RRRO", berlinClockCalculator.getHours(23))
    }

    @Test
    fun testMinutes() {
        assertEquals("YYROOOOOOOO YYOO", berlinClockCalculator.getMinutes(17))
        assertEquals("YYRYYROOOOO YYYY", berlinClockCalculator.getMinutes(34))
    }
}