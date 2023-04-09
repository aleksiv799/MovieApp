package dev.android.edu.trainee.movieapp.ui.screens


import MovieViewModel
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.android.edu.trainee.movieapp.R
import dev.android.edu.trainee.movieapp.components.GenreChipsLazyRow
import dev.android.edu.trainee.movieapp.components.MovieCard
import dev.android.edu.trainee.movieapp.domain.Movie
import dev.android.edu.trainee.movieapp.presentation.state.MovieUiState


@Composable
fun MovieListScreen(
    navController: NavController,
    viewModel: MovieViewModel,
) {
    val movieState = viewModel.moviesState.collectAsState()
    val moviesList = (movieState.value as MovieUiState.Content).movies
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HeaderMovieContent()
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            content = {
                items(moviesList.size) { position: Int ->
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        MovieCard(
                            navController = navController,
                            movie = moviesList[position]
                        )
                    }
                }
            })
    }

}

@Composable
fun HeaderMovieContent() {
    Column(
        modifier = Modifier
            .padding(top = 26.dp)
            .padding(start = 20.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(),
        ) {

            Spacer(
                Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )
            Image(
                modifier = Modifier
                    .wrapContentWidth(Alignment.End)
                    .padding(end = 20.dp)
                    .size(20.dp),
                painter = painterResource(id = R.drawable.find_icon),
                contentDescription = "",
            )
        }
        Spacer(Modifier.height(22.dp))
        Text(
            text = "Популярное сейчас",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            )
        )
        GenreChipsLazyRow()
        Spacer(Modifier.height(15.dp))
    }
}







