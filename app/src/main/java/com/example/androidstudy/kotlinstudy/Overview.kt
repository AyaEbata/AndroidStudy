package com.example.androidstudy.kotlinstudy

// 1. Kotlin の概要
fun main() {
    // Hello Worldを出力する
    println("Hello, world!")

    // 型を定義た変数を作成して、その変数を使って出力をする
    val count: Int = 2  // 型推論で行けるので val count = 2 と書ける
    println("You have $count unread messages.")

    // val は再代入出来ないので var を使う
    var cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")

    // Unit 型
    birthdayGreeting()

    // 引数ありの戻り値 String
    println(birthdayGreeting2("Rover"))

    // 名前付き引数
    println(birthdayGreeting2(name = "Rex"))

    // デフォルトの引数が設定されているので、nameの指定がなくてもエラーにならない
    println(birthdayGreeting2())
}

fun birthdayGreeting(): Unit {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

fun birthdayGreeting2(name: String = "Rover"): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
