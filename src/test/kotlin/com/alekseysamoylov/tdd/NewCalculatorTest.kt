package com.alekseysamoylov.tdd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.math.BigDecimal


class NewCalculatorTest {

    private lateinit var calculator: Calculator

    @BeforeEach
    fun setup() {
        calculator = Calculator()
    }

    @Test
    fun testNewCalculatorHasAnAccumulatorOfZer() {
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator())
    }

    @Test
    fun testSettingAccumulatorValue() {
        val value = BigDecimal(23)
        calculator.setAccumulator(value)
        assertEquals(BigDecimal(23), calculator.getAccumulator())
    }
}
