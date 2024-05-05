package com.example.androidstudy.kotlinstudy

// 3. Kotlin の基礎（その他）
fun main() {
    // データクラスとジェネリクス
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 =
        Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    println(question1.toString())

    // シングルトン
    println("${StudentProgress.answered} of ${StudentProgress.total} answered.")

    // companion
    println("${Quiz1.answered} of ${Quiz1.total} answered.")

    // 拡張プロパティ
    println(Quiz1.progressText)

    // 拡張関数
    Quiz1.printProgressBar()

    // interface
    Quiz2().printProgressBar()

    // スコープ関数 let()
    val quiz2 = Quiz2()
    quiz2.printQuiz()

    // スコープ関数 apply()
    Quiz2().apply {
        printQuiz()
    }

    collection()
    higherOrderFunctions()
    practiceBase2()
}

val Quiz1.StudentProgress.progressText: String
    get() = "${Quiz1.answered} of ${Quiz1.total} answered"

fun Quiz1.StudentProgress.printProgressBar() {
    repeat(Quiz1.answered) { print("▓") }
    repeat(Quiz1.total - Quiz1.answered) { print("▒") }
    println()
    println(Quiz1.progressText)
}

fun collection() {
    // 配列
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem1 = rockPlanets + gasPlanets
    println(solarSystem1[0])
    println(solarSystem1[1])
    println(solarSystem1[2])
    println(solarSystem1[3])
    println(solarSystem1[4])
    println(solarSystem1[5])
    println(solarSystem1[6])
    println(solarSystem1[7])

    // List
    val solarSystem2 =
        listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem2.size)
    println(solarSystem2[2])
    println(solarSystem2.get(3))
    println(solarSystem2.indexOf("Earth"))
    println(solarSystem2.indexOf("Pluto"))

    for (planet in solarSystem2) {
        println(planet)
    }

    // MutableList
    val solarSystem3 =
        mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem3.add("Pluto")
    println(solarSystem3)
    solarSystem3.add(3, "Theia")
    println(solarSystem3)
    solarSystem3[3] = "Future Moon"
    println(solarSystem3[3])
    solarSystem3.removeAt(9)
    solarSystem3.remove("Future Moon")
    println(solarSystem3)
    println(solarSystem3.contains("Pluto"))
    println("Future Moon" in solarSystem3)

    // set
    val solarSystem4 =
        mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem4.size)
    solarSystem4.add("Pluto")
    solarSystem4.add("Mercury")
    println(solarSystem4.size)
    solarSystem4.remove("Pluto")
    println(solarSystem4.size)

    // map
    val solarSystem5 = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    println(solarSystem5.size)
    solarSystem5["Pluto"] = 5
    println(solarSystem5.size)
    println(solarSystem5["Pluto"])
    println(solarSystem5.get("Pluto"))
    solarSystem5.remove("Pluto")
    println(solarSystem5.size)
    solarSystem5.put("Jupiter", 78)
    println(solarSystem5["Jupiter"])
}

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun higherOrderFunctions() {
    // forEach
    cookies.forEach {
        println("Menu item: ${it.name}")
    }

    // map
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }
    println("Full menu:")
    fullMenu.forEach {
        println(it)
    }

    // filter
    val softBakedMenu1 = cookies.filter {
        it.softBaked
    }
    println("Soft cookies:")
    softBakedMenu1.forEach {
        println("${it.name} - $${it.price}")
    }

    // groupBy
    val groupedMenu = cookies.groupBy { it.softBaked }
    val softBakedMenu2 = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()
    println("Soft cookies:")
    softBakedMenu2.forEach {
        println("${it.name} - $${it.price}")
    }
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    // fold
    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }
    println("Total price: $${totalPrice}")

    // sortedBy
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}

fun practiceBase2() {
    val event = Event(
        "Study Kotlin",
        "Commit to studying Kotlin at least 15 minutes per day.",
        Daypart.EVENING,
        15
    )
    println(event.toString())

    val event1 = Event(
        title = "Wake up",
        description = "Time to get up",
        daypart = Daypart.MORNING,
        durationInMinutes = 0
    )
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 =
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 =
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(
        title = "Watch latest DevBytes video",
        daypart = Daypart.AFTERNOON,
        durationInMinutes = 10
    )
    val event6 = Event(
        title = "Check out latest Android Jetpack library",
        daypart = Daypart.EVENING,
        durationInMinutes = 45
    )
    val events = mutableListOf(event1, event2, event3, event4, event5, event6)
    println(events)

    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    val eventsByDaypart = events.groupBy { it.daypart }
    eventsByDaypart.forEach { (daypart, events) ->
        println(
            "${
                daypart.toString().lowercase().replaceFirstChar { it.uppercase() }
            }: ${events.size} events"
        )
    }

    println("Last event of the day: ${events.last().title}")

    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}

val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }
