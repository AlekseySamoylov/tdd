package com.alekseysamoylov.tdd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.math.BigDecimal


class OperationTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setup() {
        calculator = Calculator()
        calculator.setAccumulator(BigDecimal.valueOf(20))
        calculator.enter()
        calculator.setAccumulator(BigDecimal.valueOf(4))
    }

    @Test
    fun testSumAll() {
        calculator.enter()
        calculator.setAccumulator(BigDecimal.valueOf(40))
        calculator.execute("Sum")
        assertEquals(BigDecimal.valueOf(64), calculator.getAccumulator())
    }

    @Test
    fun testSumAllUpperCase() {
        calculator.enter()
        calculator.setAccumulator(BigDecimal.valueOf(40))
        calculator.execute("SUM")
        assertEquals(BigDecimal.valueOf(64), calculator.getAccumulator())
    }

    @Test
    fun testAddExecution() {
        calculator.execute("+")
        assertEquals(BigDecimal.valueOf(24), calculator.getAccumulator())
    }

    @Test
    fun testSubtractExecution() {
        calculator.execute("-")
        assertEquals(BigDecimal.valueOf(16), calculator.getAccumulator())
    }

    @Test
    fun testMultiplyExecution() {
        calculator.execute("*")
        assertEquals(BigDecimal.valueOf(80), calculator.getAccumulator())
    }

    @Test
    fun testDivideExecution() {
        calculator.execute("/")
        assertEquals(BigDecimal.valueOf(5), calculator.getAccumulator())
    }
}


