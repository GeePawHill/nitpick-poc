package org.geepawhill.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.geepawhill.core.Core

fun main() {
    val core = Core()
    application {
        Window(
            onCloseRequest = ::exitApplication
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text("Here's the app.")
            }
        }
    }
}
