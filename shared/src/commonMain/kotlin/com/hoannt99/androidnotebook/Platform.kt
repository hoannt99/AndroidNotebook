package com.hoannt99.androidnotebook

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform