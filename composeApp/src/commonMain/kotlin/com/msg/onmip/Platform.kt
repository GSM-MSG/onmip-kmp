package com.msg.onmip

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform