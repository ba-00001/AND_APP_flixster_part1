package com.example.and_app_flixster_part1

import org.json.JSONArray
import org.json.JSONObject

data class Movie(
    val title: String,
    val overview: String,
    val posterPath: String
) {
    companion object {
        fun fromJsonArray(movieJsonArray: JSONArray): List<Movie> {
            val movies = mutableListOf<Movie>()
            for (i in 0 until movieJsonArray.length()) {
                val movieJson = movieJsonArray.getJSONObject(i)
                movies.add(
                    Movie(
                        title = movieJson.getString("title"),
                        overview = movieJson.getString("overview"),
                        posterPath = movieJson.getString("poster_path")
                    )
                )
            }
            return movies
        }
    }
}
