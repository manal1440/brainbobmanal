package com.example.brainbobmanal

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.brainbobmanal.ui.theme.BrainbobManalTheme
import com.example.brainbobmanal.ui.theme.Typography

class Screen1() {


    @Preview(
        showBackground = true,
        device = Devices.NEXUS_6,
        showSystemUi = true
    )

    @Composable
    fun BrainbobLogo(){
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center) {


            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo", )

        }
    }

    @Composable
    fun Person(){
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(top = 24.dp),
            contentAlignment = Alignment.Center ,) {
            Column() {

                Image(
                    painter = painterResource(id = R.drawable.ic_person1),
                    contentDescription = "person Image", )
            }
        }
    }

    @Composable
    fun WelcomText() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .padding(top = 16.dp)
        ) {
            Column() {
                Text(
                    text = "Be ready to learn English easily",
                    style = Typography.h1,
                    textAlign = TextAlign.Center
                )
                Text(
                    modifier = Modifier.padding(top = 16.dp),
                    text = "Listen to stories, watch videos and improve your language with BrainBob",
                    style = Typography.body1,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        BrainbobManalTheme {
            Column() {
                BrainbobLogo()
                Person()
                WelcomText()
            }

        }
    }
}

