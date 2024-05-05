package com.example.androidstudy.kotlinstudy

open class SmartDevice(val name: String, val category: String) {

    open val deviceType = "unknown"

    var deviceStatus = "on"
        protected set

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "off"
            1 -> "on"
            else -> "unknown"
        }
    }

    open fun turnOn() {
        deviceStatus = "on"
        println("Smart device is turned on.")
    }

    open fun turnOff() {
        deviceStatus = "off"
        println("Smart device is turned off.")
    }

    fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }
}
