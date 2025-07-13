package com.msg.onmip.shared.utils

import android.util.Log

actual fun logDebug(tag: String, message: String) {
    Log.d(tag, message)
}

actual fun logError(tag: String, message: String, throwable: Throwable?) {
    Log.e(tag, message, throwable)
}

actual fun logInfo(tag: String, message: String) {
    Log.i(tag, message)
}

actual fun logWarning(tag: String, message: String) {
    Log.w(tag, message)
} 