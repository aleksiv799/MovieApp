package dev.android.edu.trainee.movieapp.domain


import androidx.annotation.DrawableRes
import dev.android.edu.trainee.movieapp.domain.model.Actor

enum class Genres(val genre: String) {
    ACTION("боевики"),
    DRAMA("драмы"),
    COMEDY("комедии"),
    ARTHOUSE("артхаус"),
    MELODRAMA("мелодрамы")
}

data class Movie(
    val id: Int = 0,
    val title: String = "Гнев человеческий ",
    @DrawableRes val photo: Int,
    val ageRec: String = "18+",
    val date_pub: String = "22 апреля",
    val rating: String = "3",
    val description: String = "Эйч — загадочный \u2028и холодный на вид джентльмен, но внутри него пылает жажда справедливости. Преследуя...",
    val actors: List<Actor> = emptyList()
)

