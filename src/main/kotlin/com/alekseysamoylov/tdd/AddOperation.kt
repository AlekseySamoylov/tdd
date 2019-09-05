package com.alekseysamoylov.tdd

import java.math.BigDecimal


class AddOperation : BinaryOperation() {
    override fun calculate(value1: BigDecimal, value2: BigDecimal): BigDecimal {
        return value1.add(value2)
    }
}
