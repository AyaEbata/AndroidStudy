package com.example.androidstudy.kotlinstudy

class FoldablePhone(private var isOpen: Boolean = false) : Phone() {

    override fun switchOn() {
        if (isOpen) {
            super.switchOn()
        }
    }

    fun switchCondition() {
        isOpen = !isOpen
    }
}
