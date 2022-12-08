package com.a7medkenawy.profilescreen.composables

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.a7medkenawy.profilescreen.ui.theme.Orange
import com.a7medkenawy.profilescreen.ui.theme.Rubik

@Composable
fun TextButton(
    text: String,
    onClick: () -> Unit,
) {
    Text(
        text = text,
        fontFamily = Rubik,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        color = Orange,
        modifier = Modifier.clickable { onClick }
    )
}