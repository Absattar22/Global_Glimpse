package com.example.globalglimpse

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen(onProceed: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.wonders)
        Image(
            painter = image,
            contentDescription = "Welcome Image",
            modifier = Modifier.size(height = 550.dp, width = 400.dp),
            alignment = Alignment.TopCenter,
        )
        Text(
            text = "Welcome to Global Glimpse !",
            style = MaterialTheme.typography.headlineSmall .copy(fontWeight = FontWeight.Bold),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 10.dp , bottom = 5.dp )
        )
        Text(
            text = "Your guide to knowing information about the world",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = onProceed,
            modifier = Modifier.padding(bottom = 60.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Proceed")
                Icon(
                    Icons.Default.ArrowForward,
                    contentDescription = null,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}