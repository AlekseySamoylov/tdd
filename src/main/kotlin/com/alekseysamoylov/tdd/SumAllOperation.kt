package com.alekseysamoylov.tdd

import java.math.BigDecimal


class SumAllOperation : Operation {
    override fun apply(operandStack: OperandStack) {
        operandStack.push(operandStack.getStreamOfValues().reduce(BigDecimal.ZERO, BigDecimal::add))
    }
}
