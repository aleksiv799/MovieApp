package dev.android.edu.trainee.movieapp.ui.screens


import MovieViewModel
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.android.edu.trainee.movieapp.domain.Movie
import dev.android.edu.trainee.movieapp.ui.theme.MovieAppTheme
import dev.android.edu.trainee.movieapp.ui.views.CircleText
import dev.android.edu.trainee.movieapp.ui.views.RatingBar


@Composable
fun MovieDetailsScreen(
    navController: NavController,
    viewModel: MovieViewModel,
    movieId: Int
) {
    val movie = viewModel.movies.first { it.id == movieId }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth,

                painter = painterResource(id = movie.photo),
                contentDescription = null
            )
            CardDetailsMovie(movie)
        }
    }
}


@Composable
fun CardDetailsMovie(
    movie: Movie
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 224.dp)
            .height(563.dp),
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    top = 35.dp
                ),
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                MovieChip()
                Text(
                    modifier = Modifier
                        .padding(
                            start = 16.dp
                        ),
                    text = movie.date_pub,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                )

                CircleText(
                    size = 40.dp,
                    textAgePermit = movie.ageRec,
                    modifier = Modifier.padding(end = 15.dp),
                fontSize = 20.sp)
            }
            Text(
                modifier = Modifier
                    .padding(
                        top = 14.dp,

                        ),
                text = movie.name,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            RatingBar(rating = movie.rating.toInt())
            Spacer(modifier = Modifier.padding(16.dp))
            Text(text  = movie.description)
            Spacer(modifier = Modifier.padding(16.dp))
            Text("Актеры", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MovieChip() {

    Chip(
        onClick = { /* Do something! */ },
        border = BorderStroke(2.dp, Color.Black),
        shape = MaterialTheme.shapes.small.copy(CornerSize(percent = 50)),
        colors = ChipDefaults.outlinedChipColors(
            contentColor = Color.Black,
            backgroundColor = MaterialTheme.colors.background,
        )

    ) {
        Text("боевики", fontFamily = FontFamily.SansSerif)
    }
}


@Preview
@Composable
fun TextInputField(
    modifier: Modifier = Modifier,
    isEnabled: Boolean = false
) {
    MovieAppTheme {
        var textValue by remember { mutableStateOf("") }
        TextField(
            value = textValue,
            enabled = isEnabled,
            onValueChange = { textValue = it },
            textStyle = TextStyle(fontSize = 16.sp, color = Color.Black)
        )
    }

}








