package dev.android.edu.trainee.movieapp.data.model

import androidx.annotation.StringRes

data class Movie(
    val id: Int,
    @StringRes val name: Int,
    val photo: Int,
    val ageRec: String,
    @StringRes val date_pub: Int,
    val rating: String,
    @StringRes val description: Int
)