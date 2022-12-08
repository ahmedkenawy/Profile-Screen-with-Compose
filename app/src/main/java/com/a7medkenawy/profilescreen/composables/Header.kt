package com.a7medkenawy.profilescreen.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.a7medkenawy.profilescreen.ui.theme.Rubik

@Composable
fun Header(title: String, subTitle: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = title,
            color = Color.Black,
            fontFamily = Rubik,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )
        Text(text = subTitle,
            color = Color.DarkGray,
            fontFamily = Rubik,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal
        )
    }
}