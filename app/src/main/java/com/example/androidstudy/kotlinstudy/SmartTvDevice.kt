package com.example.androidstudy.kotlinstudy

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart TV"

//    private var speakerVolume = 2
//        set(value) {
//            if (value in 0..100) {
//                field = value
//            }
//        }
//
//    private var channelNumber = 1
//        set(value) {
//            if (value in 0..200) {
//                field = value
//            }
//        }

    // 上記の実装を RangeRegulator を使って書くと以下になる
    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    // 動作テスト用
    fun test() {
        turnOn()
        speakerVolume = 4
        speakerVolume = 300
        increaseSpeakerVolume()
    }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun decreaseSpeakerVolume() {
        speakerVolume--
        println("Speaker volume decreased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    fun previousChannel() {
        channelNumber--
        println("Channel number decreased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}
