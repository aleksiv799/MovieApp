package dev.android.edu.trainee.movieapp.util

import android.content.Context
import android.util.Log
import dev.android.edu.trainee.movieapp.R
import dev.android.edu.trainee.movieapp.domain.Movie
import dev.android.edu.trainee.movieapp.domain.model.Actor
import org.json.JSONObject

object Mapper {

    fun fetchJsonMovie(context: Context): List<Movie> = mapJsonToMovie(loadJsonFromAssets(context))

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
        var actors = mutableListOf<Actor>()
        var movie: Movie? = null
        var actor: Actor? = null
        runCatching {
            val moviesObject = JSONObject(json).getJSONArray("movies")

            for (i in 0 until moviesObject.length()) {
                val movieJson = moviesObject.getJSONObject(i)
                val actorJsonArray = movieJson.getJSONArray("actors")
                val photoRes = mapJsonToImagePoster(movieJson, "photo")
                for (j in 0 until actorJsonArray.length()) {
                    val actorObject = actorJsonArray.getJSONObject(j)
                    val actorName = actorObject.getString("name")
                    val actorPhoto = mapJsonToImageActor(actorObject, "photo")
                    actor = Actor(actorName, actorPhoto)
                    actors.add(actor!!)
                }
                    movie = Movie(
                        id = movieJson.getInt("id"),
                        title = movieJson.getString("title"),
                        photo = photoRes,
                        rating = movieJson.getString("rating"),
                        date_pub = movieJson.getString("date_pub"),
                        description = movieJson.getString("description"),
                        actors = actors
                    )
                movies.add(movie!!)
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

    private fun mapJsonToImageActor(jsonObject: JSONObject, jsonString: String): Int {
        return when (jsonObject.getString(jsonString)) {
            "stathem" -> R.drawable.stathem
            else -> R.drawable.makkelani
        }
    }
}

