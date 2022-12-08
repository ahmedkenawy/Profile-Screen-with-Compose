package com.a7medkenawy.profilescreen.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.a7medkenawy.profilescreen.ui.theme.Green
import com.a7medkenawy.profilescreen.ui.theme.Rubik

@Composable
fun CustomButton(text: String) {
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp)),
        colors = ButtonDefaults.buttonColors(backgroundColor = Green)
    ) {
        Text(text = text,
            color = Color.White,
            fontSize = 14.sp,
            fontFamily = Rubik,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(16.dp)

        )
    }
}