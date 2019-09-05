package com.alekseysamoylov.tdd

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.util.stream.Collectors


class OperandStackTest {

    private lateinit var stack: OperandStack

    @BeforeEach
    fun setup() {
        stack = OperandStack()
    }
    @Test
    fun testNewOperandsStackPeekReturnsZero() {
        assertEquals(BigDecimal.ZERO, stack.peek())
    }

    @Test
    fun testPushingValueOntoStack() {
        stack.push(BigDecimal(12))
        assertEquals(BigDecimal(12), stack.peek())
    }

    @Test
    fun testReplacingTopOfStack() {
        stack.push(BigDecimal(22))
        val value = BigDecimal(44)
        stack.replaceTop(value)
        assertEquals(BigDecimal(44), stack.peek())

    }

    @Test
    fun testReplacingTopWithEmptyStack() {
        stack.replaceTop(BigDecimal(55))
        assertEquals(BigDecimal(55), stack.peek())
    }

    @Test
    fun testPoppingValueFromStack() {
        val value = BigDecimal(33)
        stack.push(value)
        stack.push(BigDecimal(22))
        stack.pop()
        assertEquals(BigDecimal(33), stack.peek())
    }

    @Test
    fun testPoppingEmptyStack() {
        stack.pop()
        assertEquals(BigDecimal.ZERO, stack.peek())
    }

    @Test
    fun getStreamOfValuesTest() {
        val value1 = BigDecimal(22)
        val value2 = BigDecimal(33)
        val value3 = BigDecimal(44)
        stack.push(value1)
        stack.push(value2)
        stack.push(value3)
        val listOfValues = stack.getStreamOfValues().collect(Collectors.toList())

        assertThat(listOfValues, `is`(mutableListOf(value1,value2,value3)))
    }
}
