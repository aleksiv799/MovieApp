package dev.android.edu.trainee.movieapp.ui.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    rating: Int,
) {
    val ratingState by remember {
        mutableStateOf(rating)
    }
    Row()
    {
        for (i in 1..rating) {
            Icon(
                imageVector = Icons.Outlined.Star,
                contentDescription = null,
                modifier = modifier
                    .width(20.dp)
                    .height(20.dp)
            )
        }
    }
}
