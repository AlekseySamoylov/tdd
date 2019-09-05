package com.alekseysamoylov.tdd

import java.math.BigDecimal


class SubtractOperation : BinaryOperation() {
    override fun calculate(value1: BigDecimal, value2: BigDecimal): BigDecimal {
        return value2.subtract(value1)
    }
}
