package dev.android.edu.trainee.movieapp.data

import dev.android.edu.trainee.movieapp.R
import dev.android.edu.trainee.movieapp.data.model.Movie

object DataProvider {

    val movieList = listOf(
        Movie(
            id = 1,
            name = R.string.movie_one_name,
            photo = R.drawable.poster_1,
            ageRec = "18+",
            date_pub = R.string.movie_one_date_pub,
            rating = "4",
            description = R.string.movie_one_description,
        ),
        Movie(
            id = 2,
            name = R.string.movie_two_name,
            photo = R.drawable.poster_2,
            ageRec = "6+",
            date_pub = R.string.movie_two_date_pub,
            rating = "3.5",
            description = R.string.movie_two_description,
        ),
        Movie(
            id = 3,
            name = R.string.movie_three_name,
            photo = R.drawable.poster_3,
            ageRec = "18+",
            date_pub = R.string.movie_three_date_pub,
            rating = "4",
            description = R.string.movie_three_description,
        ),
        Movie(
            id = 1,
            name = R.string.movie_four_name,
            photo = R.drawable.poster_4,
            ageRec = "12+",
            date_pub = R.string.movie_four_date_pub,
            rating = "4.3",
            description = R.string.movie_four_description,
        ),
        Movie(
            id = 1,
            name = R.string.movie_five_name,
            photo = R.drawable.poster_5,
            ageRec = "18+",
            date_pub = R.string.movie_five_date_pub,
            rating = "3.4",
            description = R.string.movie_five_description,
        ),
        Movie(
            id = 1,
            name = R.string.movie_six_name,
            photo = R.drawable.poster_6,
            ageRec = "16+",
            date_pub = R.string.movie_six_date_pub,
            rating = "4",
            description = R.string.movie_six_description,
        ),
    )
}