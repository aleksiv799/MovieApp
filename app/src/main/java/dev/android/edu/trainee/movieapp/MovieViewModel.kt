import android.app.Application
import androidx.lifecycle.ViewModel
import dev.android.edu.trainee.movieapp.R
import dev.android.edu.trainee.movieapp.data.DataProvider

class MovieViewModel: ViewModel() {

    fun getMoviesList() = DataProvider.movieList
}