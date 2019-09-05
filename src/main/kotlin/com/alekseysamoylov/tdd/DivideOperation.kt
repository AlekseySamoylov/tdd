package com.alekseysamoylov.tdd

import java.math.BigDecimal


class DivideOperation : BinaryOperation() {
    override fun calculate(value1: BigDecimal, value2: BigDecimal): BigDecimal {
        return value2.divide(value1)
    }
}
