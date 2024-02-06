package com.example.globalglimpse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.globalglimpse.ui.theme.GlobalGlimpseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GlobalGlimpseTheme {
                var showWelcomeScreen by remember { mutableStateOf(true) }

                if (showWelcomeScreen) {
                    WelcomeScreen(onProceed = { showWelcomeScreen = false })
                } else {
                   InformationScreen()
                }
            }
        }
    }
}
