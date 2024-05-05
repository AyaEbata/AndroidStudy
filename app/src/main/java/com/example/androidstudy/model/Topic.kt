package com.example.androidstudy.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val titleRes: Int,
    val courseCount: Int,
    @DrawableRes val imageRes: Int,
)
