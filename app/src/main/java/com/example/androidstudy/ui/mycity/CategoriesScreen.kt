package com.example.androidstudy.ui.mycity

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidstudy.model.Category
import com.example.androidstudy.ui.components.mycity.CategoriesList
import com.example.androidstudy.ui.theme.AndroidStudyTheme

@Composable
fun CategoriesScreen(
    navigateToRecommendations: () -> Unit,
    updateCurrentCategory: (Category) -> Unit
) {
    CategoriesList(onClick = {
        updateCurrentCategory(it)
        navigateToRecommendations()
    })
}

@Preview(showBackground = true)
@Composable
private fun CategoriesScreenPreview() {
    AndroidStudyTheme {
        CategoriesScreen(navigateToRecommendations = {}, updateCurrentCategory = {})
    }
}
