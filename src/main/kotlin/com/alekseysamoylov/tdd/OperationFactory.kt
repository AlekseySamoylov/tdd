package com.alekseysamoylov.tdd


class OperationFactory {
    fun getOperationExecutor(operation: String): Operation {
        return when(operation.toUpperCase()) {
            PLUS -> AddOperation()
            MINUS -> SubtractOperation()
            DIVIDE -> DivideOperation()
            MULTIPLY -> MultiplyOperation()
            SUM -> SumAllOperation()
            else -> throw IllegalArgumentException("Operation: $operation is not supported")
        }
    }

}

private const val PLUS = "+"
private const val MINUS = "-"
private const val MULTIPLY = "*"
private const val DIVIDE = "/"
private const val SUM = "SUM"
