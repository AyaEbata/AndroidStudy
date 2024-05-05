package com.example.androidstudy.data

import com.example.androidstudy.R
import com.example.androidstudy.model.ImageInfo

object ImageInfoDatasource {
    fun load(): List<ImageInfo> {
        return listOf<ImageInfo>(
            ImageInfo("Android character, droid", "Aya", 2023, R.drawable.droid),
            ImageInfo("Shrine at atami", "Aya", 2023, R.drawable.shirine),
            ImageInfo("Dessert", "Aya", 2023, R.drawable.dessert),
        )
    }
}
