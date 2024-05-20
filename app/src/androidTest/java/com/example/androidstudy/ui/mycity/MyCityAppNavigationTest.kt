package com.example.androidstudy.ui.mycity

import androidx.activity.ComponentActivity
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.example.androidstudy.R
import com.example.androidstudy.data.MyCityDatasource
import com.example.androidstudy.navigation.MyCityDestination
import com.example.androidstudy.testUtil.TestCompactWidth
import com.example.androidstudy.testUtil.TestExpandedWidth
import com.example.androidstudy.testUtil.assertCurrentRouteName
import com.example.androidstudy.testUtil.onNodeWithStringId
import org.junit.Rule
import org.junit.Test

class MyCityAppNavigationTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private lateinit var navController: TestNavHostController

    // @Before でやっても良き（今回はできなさそうだけど）
//    @Before
//    fun setupMyCityNavHost() {
//        composeTestRule.setContent {
//            navController = TestNavHostController(LocalContext.current).apply {
//                navigatorProvider.addNavigator(ComposeNavigator())
//            }
//            MyCityApp(navController = navController, widthSize = WindowWidthSizeClass.Compact)
//        }
//    }

    @Test
    @TestCompactWidth
    fun widthSizeCompact_initScreen_verifyCategoriesScreen() {
        setCompactContent()
        navController.assertCurrentRouteName(MyCityDestination.Categories.name)
    }

    @Test
    @TestCompactWidth
    fun widthSizeCompact_selectCategory_navigateToRecommendationsScreen() {
        setCompactContent()
        selectCategory()
        navController.assertCurrentRouteName(MyCityDestination.Recommendations.name)
    }

    @Test
    @TestCompactWidth
    fun widthSizeCompact_selectRecommendation_navigateToRecommendationDetailScreen() {
        setCompactContent()
        selectCategory()
        selectRecommendation()
        navController.assertCurrentRouteName(MyCityDestination.RecommendationDetail.name)
    }

    @Test
    @TestCompactWidth
    fun widthSizeCompact_clickBuckButtonOnRecommendationScreen_navigateToCategoriesScreen() {
        setCompactContent()
        selectCategory()
        clickBuckButton()
        navController.assertCurrentRouteName(MyCityDestination.Categories.name)
    }

    @Test
    @TestCompactWidth
    fun widthSizeCompact_clickBackButtonOnRecommendationDetailScreen_navigateToRecommendationDetailScreen() {
        setCompactContent()
        selectCategory()
        selectRecommendation()
        clickBuckButton()
        navController.assertCurrentRouteName(MyCityDestination.Recommendations.name)
    }

    @Test
    @TestExpandedWidth
    fun widthSizeExpanded_initScreen_verifyCategoriesAndRecommendationsScreen() {
        setExpandedContent()
        navController.assertCurrentRouteName(MyCityDestination.CategoriesAndRecommendations.name)
    }

    private fun setCompactContent() {
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current).apply {
                navigatorProvider.addNavigator(ComposeNavigator())
            }
            MyCityApp(navController = navController, widthSize = WindowWidthSizeClass.Compact)
        }
    }

    private fun setExpandedContent() {
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current).apply {
                navigatorProvider.addNavigator(ComposeNavigator())
            }
            MyCityApp(navController = navController, widthSize = WindowWidthSizeClass.Expanded)
        }
    }

    private fun selectCategory() {
        composeTestRule.onNodeWithStringId(MyCityDatasource.categories[0].name).performClick()
    }

    private fun selectRecommendation() {
        composeTestRule.onNodeWithStringId(MyCityDatasource.recommendations[0].name).performClick()
    }

    private fun clickBuckButton() {
        val backText = composeTestRule.activity.getString(R.string.back_button)
        composeTestRule.onNodeWithContentDescription(backText).performClick()
    }
}
