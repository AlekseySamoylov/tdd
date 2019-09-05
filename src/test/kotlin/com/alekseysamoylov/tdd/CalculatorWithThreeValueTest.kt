package com.alekseysamoylov.tdd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.math.BigDecimal


class CalculatorWithThreeValueTest {
    private lateinit var calculator: Calculator
    private lateinit var value1: BigDecimal
    private lateinit var  value2: BigDecimal
    private lateinit var  value3: BigDecimal

    @BeforeEach
    fun setup() {
        value1 = BigDecimal(12)
        value2 = BigDecimal(22)
        value3 = BigDecimal(52)
        calculator = Calculator()
        calculator.setAccumulator(value1)
        calculator.enter()
        calculator.setAccumulator(value2)
        calculator.enter()
        calculator.setAccumulator(value3)
    }

    @Test
    fun testAccumulatorAfterPushingThreeValue() {
        assertEquals(value3, calculator.getAccumulator())
    }

    @Test
    fun testAccumulatorAfterSingleDrop() {
        calculator.drop()
        assertEquals(value2, calculator.getAccumulator())
    }

    @Test
    fun testAccumulatorAfterDroppingTwice() {
        calculator.drop()
        calculator.drop()
        assertEquals(value1, calculator.getAccumulator())
    }
}
