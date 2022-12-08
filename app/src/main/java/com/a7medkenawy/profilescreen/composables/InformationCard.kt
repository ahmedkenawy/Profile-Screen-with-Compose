package com.a7medkenawy.profilescreen.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.a7medkenawy.profilescreen.ui.theme.Light
import com.a7medkenawy.profilescreen.ui.theme.Rubik

@Composable
fun InformationCard(title: String, information: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        backgroundColor = Light,
        shape = RoundedCornerShape(16.dp),
        elevation = 0.dp
    ) {
        Column(modifier = Modifier
            .padding(horizontal = 24.dp, vertical = 16.dp)) {
            Text(text = title,
                fontFamily = Rubik,
                fontWeight = FontWeight.Normal,
                fontSize = 9.sp,
                color = Color.DarkGray
            )
            Text(text = information,
                fontFamily = Rubik,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.Black)
        }

    }
}