package com.msg.onmip.shared.utils

import platform.Foundation.NSLog

actual fun logDebug(tag: String, message: String) {
    println("DEBUG [$tag]: $message")
}

actual fun logError(tag: String, message: String, throwable: Throwable?) {
    println("ERROR [$tag]: $message")
    throwable?.let { println("ERROR [$tag]: ${it.message}") }
}

actual fun logInfo(tag: String, message: String) {
    println("INFO [$tag]: $message")
}

actual fun logWarning(tag: String, message: String) {
    println("WARNING [$tag]: $message")
} 