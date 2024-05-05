package com.example.androidstudy.kotlinstudy

// 2. Kotlin の基礎
fun main() {
    condition()
    classes()
    lambda()
    practiceBase1()
}

fun condition() {
    // if / else
    val trafficLightColor1 = "Red"
    if (trafficLightColor1 == "Red") {
        println("Stop")
    } else if (trafficLightColor1 == "Yellow") {
        println("Slow")
    } else if (trafficLightColor1 == "Yellow") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }

    // when
    val x: Any = 20
    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't an integer number.")
    }

    // if/else 式
    val trafficLightColor2 = "Black"
    val message1 =
        if (trafficLightColor2 == "Red") "Stop"
        else if (trafficLightColor2 == "Yellow") "Slow"
        else if (trafficLightColor2 == "Green") "Go"
        else "Invalid traffic-light color"
    println(message1)

    // when 式
    val trafficLightColor3 = "Amber"
    val message2 = when (trafficLightColor3) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Proceed with caution."
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(message2)

    // ? をつけると null が許容される
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)
    favoriteActor = null
    println(favoriteActor)

    // これはエラーになる
//    var favoriteActor2: String? = "Sandra Oh"
//    println(favoriteActor2.length)

    // これはいける
    var favoriteActor3: String? = "Sandra Oh"
    println(favoriteActor3?.length)

    // ぬるぽが返る
//    var favoriteActor4: String? = null
//    println(favoriteActor4!!.length)

    // null チェックをすればエラーにならない
    var favoriteActor4: String? = "Sandra Oh"
    if (favoriteActor4 != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor4.length}.")
    } else {
        println("You didn't input a name.")
    }

    // エルビス演算子
    val favoriteActor5: String? = "Sandra Oh"
    val lengthOfName = favoriteActor5?.length ?: 0
    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

fun classes() {
    // class
    val smartDevice1 = SmartDevice("Android TV", "Entertainment")
    // SmartDevice(name = "Android TV", category = "Entertainment")  // こっちでもOK
    println("Device name is: ${smartDevice1.name}")
    smartDevice1.turnOn()
    smartDevice1.turnOff()
    val smartDevice2 = SmartDevice("Android TV", "Entertainment", 0)
    println(smartDevice2.deviceStatus)

    // 継承
    val smartTvDevice = SmartTvDevice("Android TV", "Entertainment")
    smartTvDevice.test()

    val smartLightDevice = SmartLightDevice("Google Light", "Utility")
    smartLightDevice.turnOn()

    var smartDevice3: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice3.turnOn()
    smartDevice3 = SmartLightDevice("Google Light", "Utility")
    smartDevice3.turnOn()

    val smartHome = SmartHome(smartTvDevice, smartLightDevice)
    smartHome.turnOnTv()
    smartHome.increaseTvVolume()
    smartHome.decreaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.changeTvChannelToPrevious()
    smartHome.printSmartTvInfo()
    smartHome.printSmartLightInfo()
    smartHome.increaseLightBrightness()
    smartHome.decreaseLightBrightness()
}

fun lambda() {
    // 関数参照演算子を使用
    val trickFunction1 = ::trick1
    trickFunction1()

    // ラムダ式
    val trickFunction2 = trick2
    trick2()
    trickFunction2()
    treat()

    // 引数を追加
//    val coins: (Int) -> String = { quantity ->
//        "$quantity quarters"
//    }
    // 上記の省略形
    val coins: (Int) -> String = {
        "$it quarters"
    }
    val trickFunction = trickOrTreat(true, null)
    val treatFunction1 = trickOrTreat(false, coins)
    val treatFunction2 = trickOrTreat(false, { "$it quarters" })
    val treatFunction3 = trickOrTreat(false) { "$it quarters" }
    trickFunction()
    treatFunction1()
    treatFunction2()
    treatFunction3()

    // 指定された回数だけ繰り返す
    repeat(4) {
        treatFunction1()
    }
}

fun trick1() {
    println("No treats!")
}

val trick2 = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick2
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

fun practiceBase1() {
    // モバイル通知
    val morningNotification = 51
    val eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

    // 映画のチケット料金
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println(
        "The movie ticket price for a person aged $senior is \$${
            ticketPrice(
                senior,
                isMonday
            )
        }."
    )

    // 温度の変換
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }

    // 楽曲カタログ
    val song = Song("hoge", "fuga", 2023, 1100)
    song.printDescription()
    println(song.isPopular)

    // インターネット プロフィール
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()

    // 折りたたみ式スマートフォン
    val phone = FoldablePhone()
    phone.switchOn()
    phone.checkPhoneScreenLight()
    phone.switchCondition()
    phone.switchOn()
    phone.checkPhoneScreenLight()

    // 特殊なオークション
    val winningBid = Bid(5000, "Private Collector")
    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement =
        String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}
