package com.example.globalglimpse

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DisplayScreen(
    modifier: Modifier,
    onInformationClicked: () -> Unit,
    onOldWondersClicked: () -> Unit
) {

        Column {
            Image(
                painter = painterResource(id = R.drawable.geo),
                contentDescription = "Geography Photo",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )

            Text(
                text = "What Do You Want to Read About?",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 10.dp , start = 20.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = onInformationClicked,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Text(text = "New Wonders")
                }
                Button(
                    onClick = onOldWondersClicked,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Text(text = "Old Wonders")
                }
            }
    }
}
