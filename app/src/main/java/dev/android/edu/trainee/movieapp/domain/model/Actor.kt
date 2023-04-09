package dev.android.edu.trainee.movieapp.domain.model

import androidx.annotation.DrawableRes


data class Actor
    (val name: String,
     @DrawableRes
     val image: Int)