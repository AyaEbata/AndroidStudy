package com.example.androidstudy.data

import com.example.androidstudy.R
import com.example.androidstudy.model.Category
import com.example.androidstudy.model.Recommendation

object MyCityDatasource {
    val categories = listOf(
        Category(R.string.category_ramen, R.drawable.ramen),
        Category(R.string.category_sushi, R.drawable.sushi),
        Category(R.string.category_cafe, R.drawable.cafe),
        Category(R.string.category_other, R.drawable.syumai),
    )

    val recommendations = listOf(
        Recommendation(
            R.string.ramen_jiro_kannai,
            R.drawable.ramen_jiro,
            R.string.ramen_jiro_kannai_description,
            categories[0]
        ),
        Recommendation(
            R.string.yoshimuraya,
            R.drawable.yoshimuraya,
            R.string.yoshimuraya_description,
            categories[0]
        ),
        Recommendation(
            R.string.newtantan_kyomachi,
            R.drawable.newtantan,
            R.string.newtantan_kyomachi_description,
            categories[0]
        ),
        Recommendation(
            R.string.gyokusentei,
            R.drawable.gyokusentei,
            R.string.gyokusentei_description,
            categories[0]
        ),
        Recommendation(
            R.string.kurazushi,
            R.drawable.kurazushi,
            R.string.kurazushi_description,
            categories[1]
        ),
        Recommendation(
            R.string.hamazushi,
            R.drawable.hamazushi,
            R.string.hamazushi_description,
            categories[1]
        ),
        Recommendation(
            R.string.sushiro,
            R.drawable.sushiro,
            R.string.sushiro_description,
            categories[1]
        ),
        Recommendation(
            R.string.komeda_coffee,
            R.drawable.komeda_coffee,
            R.string.komeda_coffee_description,
            categories[2]
        ),
        Recommendation(
            R.string.starbucks,
            R.drawable.starbucks,
            R.string.starbucks_description,
            categories[2]
        ),
        Recommendation(
            R.string.subway,
            R.drawable.subway,
            R.string.subway_description,
            categories[3]
        ),
    )
}
