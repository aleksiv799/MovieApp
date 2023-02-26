package dev.android.edu.trainee.movieapp.ui.views

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CircleText(
    textAgePermit: String,
    size: Dp,
    modifier: Modifier,
    fontSize: TextUnit,
) {
    Box(
        modifier = modifier
            .size(size)
            .border(
                width = 1.dp,
                color = MaterialTheme.colors.onSecondary,
                shape = CircleShape
            ),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = textAgePermit,
            textAlign = TextAlign.Center,
            fontSize = fontSize
        )
    }
}


