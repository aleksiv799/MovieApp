package dev.android.edu.trainee.movieapp.navigation

sealed class Screen(
    val route: String
) {

    object HomeScreen : Screen(ROUTE_LIST_MOVIES)

    object DetailsScreen : Screen(ROUTE_DETAILS_MOVIES)

    object ProfileScreen : Screen(ROUTE_PROFILE)

    companion object {
        const val ID_MOVIE = "id"
        const val ROUTE_PROFILE = "profile"
        const val ROUTE_LIST_MOVIES = "home"
        const val ROUTE_DETAILS_MOVIES = "details"
    }
}



