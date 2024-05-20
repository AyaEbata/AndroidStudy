package com.example.androidstudy.ui.mycity

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.data.MyCityDatasource
import com.example.androidstudy.model.Category
import com.example.androidstudy.model.Recommendation
import com.example.androidstudy.ui.components.mycity.RecommendationsList
import com.example.androidstudy.ui.theme.AndroidStudyTheme
import com.example.androidstudy.model.Recommendation as RecommendationModel

@Composable
fun RecommendationsScreen(
    navigateToRecommendationDetail: () -> Unit,
    updateCurrentRecommendation: (Recommendation) -> Unit,
    currentCategory: Category?
) {
    RecommendationsList(currentCategory = currentCategory, onClick = {
        navigateToRecommendationDetail()
        updateCurrentRecommendation(it)
    })
}

@Preview(showBackground = true)
@Composable
private fun RecommendationsScreenPreview() {
    AndroidStudyTheme {
        RecommendationsScreen(
            navigateToRecommendationDetail = {},
            updateCurrentRecommendation = {},
            currentCategory = MyCityDatasource.categories[0],
        )
    }
}
