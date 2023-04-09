package dev.android.edu.trainee.movieapp.data

import android.content.Context
import dev.android.edu.trainee.movieapp.util.Mapper
import dev.android.edu.trainee.movieapp.domain.Movie

class  DataProvider(private val appContext: Context) {

    fun getMovies(): List<Movie> = Mapper.fetchJsonMovie(appContext)

}


