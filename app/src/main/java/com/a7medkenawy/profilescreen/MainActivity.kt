package com.a7medkenawy.profilescreen

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.a7medkenawy.profilescreen.composables.*
import com.a7medkenawy.profilescreen.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileScreenTheme {
                ProfileScreen()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ProfileScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(vertical = 32.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(title = "Account", subTitle = "Edit and manage your account")
        SpacerVertical32()
        ProfileImage(R.drawable.profile)
        SpacerVertical24()
        TextButton(text = "Change Profile Picture") {}
        SpacerVertical32()
        Row {
            Box(modifier = Modifier
                .weight(1f)
                .padding(end = 8.dp)) {
                InformationCard("First Name", "Ahmed")
            }
            Box(modifier = Modifier
                .weight(1f)
                .padding(start = 8.dp)) {
                InformationCard("Last Name", "Kenawy")
            }
        }
        InformationCard("Location", "Cairo,Egypt")
        InformationCard("Email", "a7medsa3dkenawy@gmail.com")
        InformationCard("Phone", "+201201204217")
        Spacer(modifier = Modifier.weight(1f))
        CustomButton(text = "Save")


    }
}