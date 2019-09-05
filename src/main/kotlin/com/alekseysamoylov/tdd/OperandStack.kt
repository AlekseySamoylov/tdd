package com.alekseysamoylov.tdd

import java.math.BigDecimal
import java.util.*
import java.util.stream.Stream

class OperandStack {
    private var stack = Stack<BigDecimal>()
    fun peek(): BigDecimal {
        return if (stack.isNotEmpty()) {
            stack.peek()
        } else {
            BigDecimal.ZERO
        }
    }

    fun push(value: BigDecimal) {
        stack.push(value)
    }

    fun replaceTop(value: BigDecimal) {
        pop()
        stack.push(value)
    }

    fun pop(): BigDecimal {
        return if (stack.isNotEmpty()) {
            stack.pop()
        } else {
            BigDecimal.ZERO
        }
    }

    fun getStreamOfValues(): Stream<BigDecimal> {
        return stack.stream()
    }
}
