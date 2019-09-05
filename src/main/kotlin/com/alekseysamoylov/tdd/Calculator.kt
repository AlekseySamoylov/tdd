package com.alekseysamoylov.tdd

import java.math.BigDecimal

class Calculator() {
    private val operandStack = OperandStack()
    constructor(value: BigDecimal = BigDecimal.ZERO) : this() {
        operandStack.push(value)
    }
    fun getAccumulator(): BigDecimal {
        return operandStack.peek()
    }

    fun setAccumulator(value: BigDecimal) {
        operandStack.replaceTop(value)
    }

    fun enter() {
        operandStack.push(getAccumulator())
    }

    fun drop() {
        operandStack.pop()
    }

    fun execute(operation: String) {
        val operationFactory = OperationFactory()
        val operationExecutor = operationFactory.getOperationExecutor(operation)
        operationExecutor.apply(operandStack)
    }

}
