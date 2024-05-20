package com.example.androidstudy.ui.mycity

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.androidstudy.data.MyCityDatasource
import com.example.androidstudy.testUtil.TestCompactWidth
import com.example.androidstudy.testUtil.onNodeWithContentDescriptionForStringId
import com.example.androidstudy.testUtil.onNodeWithStringId
import org.junit.Rule
import org.junit.Test

@TestCompactWidth
class RecommendationDetailScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun verifyContent() {
        val currentRecommendation = MyCityDatasource.recommendations[1]

        composeTestRule.setContent {
            RecommendationDetailScreen(currentRecommendation = currentRecommendation)
        }

        composeTestRule.onNodeWithStringId(currentRecommendation.name).assertIsDisplayed()
        composeTestRule.onNodeWithContentDescriptionForStringId(currentRecommendation.name).assertIsDisplayed()
        composeTestRule.onNodeWithStringId(currentRecommendation.description).assertIsDisplayed()
    }
}
