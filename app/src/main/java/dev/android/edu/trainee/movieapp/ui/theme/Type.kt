package dev.android.edu.trainee.movieapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.android.edu.trainee.movieapp.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )



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
)

val RobotoFontFamily = FontFamily(
    Font(R.font.roboto_bold),
    Font(R.font.roboto_medium),
    Font(R.font.roboto_regular),
    Font(R.font.roboto_light)
)

val MovieTypography = Typography (
    defaultFontFamily = RobotoFontFamily,
    body1 = TextStyle(
        fontFamily = RobotoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)