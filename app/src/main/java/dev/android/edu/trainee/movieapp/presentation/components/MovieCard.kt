package dev.android.edu.trainee.movieapp.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.android.edu.trainee.movieapp.util.Constants
import dev.android.edu.trainee.movieapp.domain.Movie
import dev.android.edu.trainee.movieapp.navigation.Screen


@Composable
fun MovieCard(navController: NavController, movie: Movie) {

    Card(
        modifier = Modifier
            .width(Constants.card_width)
            .height(Constants.card_height)
            .clickable { navController.navigate(Screen.DetailsScreen.route + "/${movie.id}") },
        shape = RoundedCornerShape(Constants.shape_round_size)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = movie.photo),
                contentDescription = movie.title,
                modifier = Modifier
                    .height(Constants.image_size_h)
                    .fillMaxWidth()
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = movie.title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = movie.description,
                    modifier = Modifier
                        .width(Constants.card_width),
                    maxLines = 4,
                    fontSize = 12.sp,
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                RatingBar(rating = movie.rating.toInt())
                CircleText(
                    size = 20.dp,
                    textAgePermit = movie.ageRec,
                    modifier = Modifier.padding(end = 15.dp),
                    fontSize = 7.sp
                )
            }

        }
    }
}

