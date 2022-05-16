package com.example.brainbobmanal.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.brainbobmanal.R

//// Set of Material typography styles to start with
//val Typography = Typography(
//    body1 = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp
//    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
val lato = FontFamily(
        Font(R.font.lato_bold, FontWeight.Bold),
        Font(R.font.lato_regular, FontWeight.Normal)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp
    ),
    body1 = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
