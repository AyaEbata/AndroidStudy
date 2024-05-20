package com.example.androidstudy.ui.mycity

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.androidstudy.data.MyCityDatasource
import com.example.androidstudy.testUtil.TestCompactWidth
import com.example.androidstudy.testUtil.TestExpandedWidth
import com.example.androidstudy.testUtil.onNodeWithStringId
import org.junit.Rule
import org.junit.Test

@TestCompactWidth
class CategoriesScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun verifyContent() {
        composeTestRule.setContent {
            CategoriesScreen(navigateToRecommendations = {}, updateCurrentCategory = {})
        }

        MyCityDatasource.categories.forEach {
            composeTestRule.onNodeWithStringId(it.name).assertIsDisplayed()
        }
    }
}
