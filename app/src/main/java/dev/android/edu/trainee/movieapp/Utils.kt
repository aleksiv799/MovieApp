package dev.android.edu.trainee.movieapp

import android.content.Context
import dev.android.edu.trainee.movieapp.domain.Movie
import org.json.JSONObject

object Utils {

    fun fetchJsonMovie(context: Context): List<Movie> =  mapJsonToMovie(loadJsonFromAssets(context))

    fun loadJsonFromAssets(context: Context): String {
        var result = ""

        runCatching {
            val input = context.assets.open("movie.json")
            val size = input.available()
            val bytes = ByteArray(size)
            input.read(bytes)
            input.close()
            result = String(bytes)
        }.onFailure {
            it.printStackTrace()
        }
        return result
    }

    fun mapJsonToMovie(json: String): List<Movie> {
        val movies = mutableListOf<Movie>()
        runCatching {
            val moviesObject = JSONObject(json).getJSONArray("movies")

            for (i in 0 until moviesObject.length()) {
                val movieJson = moviesObject.getJSONObject(i)
                val photoRes = mapJsonToImagePoster(movieJson, "photo")
                val movie = Movie(
                    id = movieJson.getInt("id"),
                    name = movieJson.getString("title"),
                    photo = photoRes,
                    rating = movieJson.getString("rating"),
                    date_pub = movieJson.getString("date_pub"),
                    description = movieJson.getString("description")
                )
                movies.add(movie)
            }
        }.onFailure {
            it.printStackTrace()
        }
        return movies
    }

    private fun mapJsonToImagePoster(jsonObject: JSONObject, jsonString: String): Int {
       return when (jsonObject.getString(jsonString)) {
            "poster_1.png" -> R.drawable.poster_1
            "poster_2" -> R.drawable.poster_2
            "poster_3" -> R.drawable.poster_3
            "poster_4" -> R.drawable.poster_4
            "poster_5" -> R.drawable.poster_5
            else -> R.drawable.poster_6

        }
    }
}

