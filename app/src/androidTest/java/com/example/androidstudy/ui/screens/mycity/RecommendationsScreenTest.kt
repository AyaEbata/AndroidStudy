package com.example.androidstudy.ui.screens.mycity

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.androidstudy.data.MyCityDatasource
import com.example.androidstudy.testUtil.TestCompactWidth
import com.example.androidstudy.testUtil.onNodeWithStringId
import com.example.androidstudy.ui.screens.mycity.RecommendationsScreen
import org.junit.Rule
import org.junit.Test

@TestCompactWidth
class RecommendationsScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun verifyContent() {
        val currentCategory = MyCityDatasource.categories[1]

        composeTestRule.setContent {
            RecommendationsScreen(navigateToRecommendationDetail = {}, updateCurrentRecommendation = {}, currentCategory = currentCategory)
        }

        MyCityDatasource.recommendations.groupBy { it.category }[currentCategory]?.forEach{
            composeTestRule.onNodeWithStringId(it.name).assertIsDisplayed()
        }
    }
}
