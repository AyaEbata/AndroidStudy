package com.example.androidstudy.kotlinstudy

class Song(
    private val title: String,
    private val artist: String,
    private val releasedAt: Int,
    private val totalPlay: Int,
) {

    val isPopular: Boolean
        get() = totalPlay >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $releasedAt.")
    }
}
