package com.example.androidstudy.ui.mycity

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.data.MyCityDatasource
import com.example.androidstudy.model.Category
import com.example.androidstudy.model.Recommendation
import com.example.androidstudy.ui.components.mycity.CategoriesList
import com.example.androidstudy.ui.components.mycity.RecommendationDetail
import com.example.androidstudy.ui.components.mycity.RecommendationsList
import com.example.androidstudy.ui.theme.AndroidStudyTheme

@Composable
fun CategoriesAndRecommendationsScreen(
    currentCategory: Category?,
    currentRecommendation: Recommendation,
    updateCurrentCategory: (Category) -> Unit,
    updateCurrentRecommendation: (Recommendation) -> Unit,
) {
    Row {
        if (currentCategory == null) {
            CategoriesList(
                onClick = { updateCurrentCategory(it) },
                modifier = Modifier.weight(1.0f)
            )
        } else {
            RecommendationsList(
                currentCategory = currentCategory,
                onClick = { updateCurrentRecommendation(it) },
                modifier = Modifier.weight(1.0f)
            )
        }
        RecommendationDetail(
            currentRecommendation = currentRecommendation,
            modifier = Modifier
                .weight(1.0f)
                .padding(top = 32.dp, start = 112.dp, end = 112.dp)
        )
    }
}

@Preview(showBackground = true, widthDp = 1000, heightDp = 500)
@Composable
fun CategoriesAndRecommendationsScreenPreview() {
    AndroidStudyTheme {
        CategoriesAndRecommendationsScreen(
            currentCategory = MyCityDatasource.recommendations[0].category,
            currentRecommendation = MyCityDatasource.recommendations[0],
            updateCurrentCategory = {},
            updateCurrentRecommendation = {},
        )
    }
}
