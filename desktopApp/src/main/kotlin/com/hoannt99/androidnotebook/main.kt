package com.hoannt99.androidnotebook

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "AndroidNotebook",
    ) {
        App()
    }
}