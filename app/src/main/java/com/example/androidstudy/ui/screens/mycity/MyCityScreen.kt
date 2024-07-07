package com.example.androidstudy.ui.screens.mycity

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.androidstudy.R
import com.example.androidstudy.navigation.MyCityDestination
import com.example.androidstudy.ui.components.mycity.MyCityAppBar
import com.example.androidstudy.ui.theme.AndroidStudyTheme
import com.example.androidstudy.utils.MyCityContentType

// MyCityScreen はonCreate()の代わり
@Composable
fun MyCityScreen(widthSize: WindowWidthSizeClass) {
    MyCityApp(widthSize = widthSize)
}

@VisibleForTesting
@Composable
fun MyCityApp(
    widthSize: WindowWidthSizeClass,
    navController: NavHostController = rememberNavController()
) {
    val viewModel: MyCityViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = MyCityDestination.valueOf(
        backStackEntry?.destination?.route ?: MyCityDestination.Categories.name
    )

    val contentType = when (widthSize) {
        WindowWidthSizeClass.Compact -> MyCityContentType.ListOnly
        WindowWidthSizeClass.Medium -> MyCityContentType.ListOnly
        WindowWidthSizeClass.Expanded -> MyCityContentType.ListAndDetail
        else -> MyCityContentType.ListOnly
    }
    val startDestination = when (contentType) {
        MyCityContentType.ListOnly -> MyCityDestination.Categories.name
        MyCityContentType.ListAndDetail -> MyCityDestination.CategoriesAndRecommendations.name
    }
    val isHome =
        currentScreen == MyCityDestination.Categories || (currentScreen == MyCityDestination.CategoriesAndRecommendations && uiState.currentCategory == null)

    Scaffold(
        topBar = {
            MyCityAppBar(
                // canNavigateBack = navController.previousBackStackEntry != null で書きたかったけど、
                // navControllerが複数あるとうまく動かない・・・？
                // 今回は練習アプリを1つのアプリにまとめたかったので一旦以下で代用する
                canNavigateBack = !isHome,
                onBackButtonClicked = {
                    if (currentScreen != MyCityDestination.CategoriesAndRecommendations) {
                        navController.navigateUp()
                    } else {
                        viewModel.updateCurrentCategory(null)
                    }
                },
                title = getTitle(currentScreen, uiState)
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = startDestination,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = MyCityDestination.Categories.name) {
                CategoriesScreen(
                    navigateToRecommendations = { navController.navigate(MyCityDestination.Recommendations.name) },
                    updateCurrentCategory = viewModel::updateCurrentCategory
                )
            }
            composable(route = MyCityDestination.Recommendations.name) {
                RecommendationsScreen(
                    navigateToRecommendationDetail = { navController.navigate(MyCityDestination.RecommendationDetail.name) },
                    updateCurrentRecommendation = viewModel::updateCurrentRecommendation,
                    currentCategory = uiState.currentCategory
                )
            }
            composable(route = MyCityDestination.RecommendationDetail.name) {
                RecommendationDetailScreen(currentRecommendation = uiState.currentRecommendation)
            }
            composable(route = MyCityDestination.CategoriesAndRecommendations.name) {
                CategoriesAndRecommendationsScreen(
                    currentCategory = uiState.currentCategory,
                    currentRecommendation = uiState.currentRecommendation,
                    updateCurrentCategory = viewModel::updateCurrentCategory,
                    updateCurrentRecommendation = viewModel::updateCurrentRecommendation,
                )
            }
        }
    }
}

private fun getTitle(
    currentScreen: MyCityDestination,
    uiState: MyCityUiState
) = when (currentScreen) {
    MyCityDestination.Categories -> R.string.my_city_app_title
    MyCityDestination.Recommendations -> uiState.currentCategory?.name ?: R.string.my_city_app_title
    MyCityDestination.RecommendationDetail -> uiState.currentRecommendation.name
    MyCityDestination.CategoriesAndRecommendations -> {
        if (uiState.currentCategory == null) {
            R.string.my_city_app_title
        } else {
            uiState.currentCategory.name
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MyCityScreenCompactPreview() {
    AndroidStudyTheme {
        MyCityScreen(widthSize = WindowWidthSizeClass.Compact)
    }
}

@Preview(showBackground = true, widthDp = 700)
@Composable
private fun MyCityScreenMediumPreview() {
    AndroidStudyTheme {
        MyCityScreen(widthSize = WindowWidthSizeClass.Medium)
    }
}

@Preview(showBackground = true, widthDp = 1000)
@Composable
private fun MyCityScreenExpandedPreview() {
    AndroidStudyTheme {
        MyCityScreen(widthSize = WindowWidthSizeClass.Expanded)
    }
}
