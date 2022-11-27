package com.emon.domain.base


sealed class ValidationResult{
    object Success : ValidationResult()
    data class Failure<T>(val ioErrorResult: T) : ValidationResult()
}