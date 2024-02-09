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
            var showWelcomeScreen by remember { mutableStateOf(true) }
            var showNewWondersScreen by remember { mutableStateOf(false) }
            var showOldWondersScreen by remember { mutableStateOf(false) }

            GlobalGlimpseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    if (showWelcomeScreen) {
                        WelcomeScreen(
                            modifier = Modifier.fillMaxSize(),
                            onProceed = { showWelcomeScreen = false }
                        )
                    } else {
                        if (!showNewWondersScreen && !showOldWondersScreen) {
                            DisplayScreen(
                                modifier = Modifier.fillMaxSize(),
                                onInformationClicked = { showNewWondersScreen = true },
                                onOldWondersClicked = { showOldWondersScreen = true }
                            )
                        } else if (showNewWondersScreen) {
                            InformationScreen(
                                modifier = Modifier.fillMaxSize(),
                                onBackClicked = { showNewWondersScreen = false }
                            )
                        } else if (showOldWondersScreen) {
                            OldWondersScreen(
                                modifier = Modifier.fillMaxSize(),
                                onBackClicked = { showOldWondersScreen = false }
                            )
                        }
                    }
                }
            }
        }
    }
}