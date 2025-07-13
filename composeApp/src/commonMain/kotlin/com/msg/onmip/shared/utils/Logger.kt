package com.msg.onmip.shared.utils

expect fun logDebug(tag: String, message: String)
expect fun logError(tag: String, message: String, throwable: Throwable? = null)
expect fun logInfo(tag: String, message: String)
expect fun logWarning(tag: String, message: String)

object Logger {
    fun debug(tag: String, message: String) = logDebug(tag, message)
    fun error(tag: String, message: String, throwable: Throwable? = null) = logError(tag, message, throwable)
    fun info(tag: String, message: String) = logInfo(tag, message)
    fun warning(tag: String, message: String) = logWarning(tag, message)
} 