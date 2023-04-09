import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import dev.android.edu.trainee.movieapp.data.DataProvider
import dev.android.edu.trainee.movieapp.presentation.state.MovieUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class MovieViewModel(app: Application) : AndroidViewModel(app) {

    private val dataProvider: DataProvider by lazy {
        DataProvider(appContext = app)
    }
    val movies = dataProvider.getMovies()


    private val _moviesState = MutableStateFlow<MovieUiState>(MovieUiState.Loading)
    val moviesState = _moviesState.asStateFlow()

    init {
        viewModelScope.launch {
            _moviesState.value = MovieUiState.Content(movies)

        }
    }

}

class FilmViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieViewModel::class.java)) {
            return MovieViewModel(app = application) as T
        }
        throw IllegalArgumentException("Invalidate ViewModel Class")
    }
}