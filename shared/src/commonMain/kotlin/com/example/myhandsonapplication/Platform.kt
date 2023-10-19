package com.example.myhandsonapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
