package com.example.androidstudy.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class OneDay(
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int,
)
