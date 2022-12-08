package com.a7medkenawy.profilescreen.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ProfileImage(resourceId: Int) {
    Image(painter = painterResource(id = resourceId),
        contentDescription = "profile",
        modifier = Modifier
            .clip(shape = RoundedCornerShape(20.dp))
            .size(120.dp))
}