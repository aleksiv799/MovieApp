package dev.android.edu.trainee.movieapp.presentation.state

import dev.android.edu.trainee.movieapp.domain.Movie


sealed class MovieUiState {

    object Loading : MovieUiState()
    data class Error(val errorMessage: String) : MovieUiState()
    data class Content(val movies: List<Movie>) : MovieUiState()

}
