package com.alekseysamoylov.tdd

import java.math.BigDecimal


abstract class BinaryOperation : Operation {
    override fun apply(operandStack: OperandStack) {
        val value1 = operandStack.peek()
        operandStack.pop()
        val value2 = operandStack.peek()
        operandStack.replaceTop(calculate(value1, value2))
    }

    protected abstract fun calculate(value1: BigDecimal, value2: BigDecimal): BigDecimal
}
