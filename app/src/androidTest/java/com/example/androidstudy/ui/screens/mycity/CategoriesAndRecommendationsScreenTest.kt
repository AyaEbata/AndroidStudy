package com.example.androidstudy.ui.screens.mycity

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.androidstudy.data.MyCityDatasource
import com.example.androidstudy.testUtil.TestExpandedWidth
import com.example.androidstudy.testUtil.onNodeWithContentDescriptionForStringId
import com.example.androidstudy.testUtil.onNodeWithStringId
import com.example.androidstudy.ui.screens.mycity.CategoriesAndRecommendationsScreen
import org.junit.Rule
import org.junit.Test

@TestExpandedWidth
class CategoriesAndRecommendationsScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun verifyContent_init() {
        val currentRecommendation = MyCityDatasource.recommendations[0]

        composeTestRule.setContent {
            CategoriesAndRecommendationsScreen(
                currentCategory = null,
                currentRecommendation = currentRecommendation,
                updateCurrentCategory = {},
                updateCurrentRecommendation = {}
            )
        }

        MyCityDatasource.categories.forEach {
            composeTestRule.onNodeWithStringId(it.name).assertIsDisplayed()
        }
        composeTestRule.onNodeWithStringId(currentRecommendation.name).assertIsDisplayed()
        composeTestRule.onNodeWithContentDescriptionForStringId(currentRecommendation.name).assertIsDisplayed()
        composeTestRule.onNodeWithStringId(currentRecommendation.description).assertIsDisplayed()
    }

    @Test
    fun verifyContent_selectCategory() {
        val currentCategory = MyCityDatasource.categories[1]
        val currentRecommendation = MyCityDatasource.recommendations[0]

        composeTestRule.setContent {
            CategoriesAndRecommendationsScreen(
                currentCategory = currentCategory,
                currentRecommendation = currentRecommendation,
                updateCurrentCategory = {},
                updateCurrentRecommendation = {}
            )
        }

        MyCityDatasource.recommendations.groupBy { it.category }[currentCategory]?.forEach{
            composeTestRule.onNodeWithStringId(it.name).assertIsDisplayed()
        }
        composeTestRule.onNodeWithStringId(currentRecommendation.name).assertIsDisplayed()
        composeTestRule.onNodeWithContentDescriptionForStringId(currentRecommendation.name).assertIsDisplayed()
        composeTestRule.onNodeWithStringId(currentRecommendation.description).assertIsDisplayed()
    }

    @Test
    fun verifyContent_selectRecommendation() {
        val currentCategory = MyCityDatasource.categories[1]
        val currentRecommendation = MyCityDatasource.recommendations[1]

        composeTestRule.setContent {
            CategoriesAndRecommendationsScreen(
                currentCategory = currentCategory,
                currentRecommendation = currentRecommendation,
                updateCurrentCategory = {},
                updateCurrentRecommendation = {}
            )
        }

        MyCityDatasource.recommendations.groupBy { it.category }[currentCategory]?.forEach{
            composeTestRule.onNodeWithStringId(it.name).assertIsDisplayed()
        }
        composeTestRule.onNodeWithStringId(currentRecommendation.name).assertIsDisplayed()
        composeTestRule.onNodeWithContentDescriptionForStringId(currentRecommendation.name).assertIsDisplayed()
        composeTestRule.onNodeWithStringId(currentRecommendation.description).assertIsDisplayed()
    }
}
