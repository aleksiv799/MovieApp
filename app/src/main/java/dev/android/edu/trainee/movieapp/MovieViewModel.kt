import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.android.edu.trainee.movieapp.Utils

class MovieViewModel(app: Application): AndroidViewModel(app) {

    private val context = app
     val movies = Utils.fetchJsonMovie(context)
}

class FilmViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieViewModel::class.java)) {
            return MovieViewModel(app = application) as T
        }
        throw IllegalArgumentException("Invalidate ViewModel Class")
    }
}