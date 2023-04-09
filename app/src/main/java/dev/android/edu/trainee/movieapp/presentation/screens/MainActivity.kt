package dev.android.edu.trainee.movieapp.presentation.screens

import FilmViewModelFactory
import MovieViewModel
import android.app.Application
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import dev.android.edu.trainee.movieapp.navigation.AppNavGraph
import dev.android.edu.trainee.movieapp.ui.screens.MovieListScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val context = LocalContext.current
            val viewModel: MovieViewModel =
                viewModel(factory = FilmViewModelFactory(
                    context.applicationContext as Application))
            Column() {
                Row(
                    modifier = Modifier
                        .padding(top = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {}
                AppNavGraph(viewModel = viewModel, navController = navController)
            }
        }
    }
}





