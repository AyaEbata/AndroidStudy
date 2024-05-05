package com.example.androidstudy.kotlinstudy

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")

        val hobbyMessage = if (hobby != null) "Likes to $hobby. " else ""
        val referrerMessage =
            if (referrer != null) {
                if (referrer.hobby != null) "Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}. " else ""
            } else {
                "Doesn't have a referrer."
            }
        println("$hobbyMessage$referrerMessage")
    }
}
