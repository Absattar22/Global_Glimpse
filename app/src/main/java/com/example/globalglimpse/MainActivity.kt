package com.example.globalglimpse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.globalglimpse.ui.theme.GlobalGlimpseTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GlobalGlimpseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
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
}
