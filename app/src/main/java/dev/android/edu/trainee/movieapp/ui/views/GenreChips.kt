package dev.android.edu.trainee.movieapp.ui.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.android.edu.trainee.movieapp.domain.Genres


@Composable
fun GenreChipsLazyRow() {
    LazyRow(contentPadding = PaddingValues(start = 20.dp)) {
        items(Genres.values()) { genre ->
            GenresChips(genre)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun GenresChips(genres: Genres) {
    Chip(
        onClick = {/*Do something*/ },
        modifier = Modifier
            .padding(end = 4.dp),
        border = BorderStroke(width = 1.dp, color = MaterialTheme.colors.onSecondary),
        colors = ChipDefaults.chipColors(backgroundColor = Color.Transparent)
    ) {
        Text(text = genres.genre)
    }
}

@Preview
@Composable
fun ShowGenreChips() {
    GenreChipsLazyRow()
}