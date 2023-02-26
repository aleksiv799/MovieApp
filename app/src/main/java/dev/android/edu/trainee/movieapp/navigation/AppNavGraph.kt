package dev.android.edu.trainee.movieapp.navigation

import MovieViewModel
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.android.edu.trainee.movieapp.ui.screens.MovieDetailsScreen
import dev.android.edu.trainee.movieapp.ui.screens.MovieListScreen



@Composable
fun AppNavGraph(
    viewModel: MovieViewModel,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(Screen.HomeScreen.route) {
            MovieListScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(Screen.DetailsScreen.route + "/{${Screen.ID_MOVIE}}") { navBackStackEntry ->
            navBackStackEntry.arguments?.getString(Screen.ID_MOVIE)?.let {
                MovieDetailsScreen(
                    navController = navController,
                    viewModel = viewModel,
                    movieId = it.toInt())
            }
        }
    }
}