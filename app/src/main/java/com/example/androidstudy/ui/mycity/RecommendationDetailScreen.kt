package com.example.androidstudy.ui.mycity

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.data.MyCityDatasource
import com.example.androidstudy.model.Recommendation
import com.example.androidstudy.ui.components.mycity.RecommendationDetail
import com.example.androidstudy.ui.theme.AndroidStudyTheme

@Composable
fun RecommendationDetailScreen(currentRecommendation: Recommendation) {
    RecommendationDetail(
        currentRecommendation = currentRecommendation,
        modifier = Modifier.padding(top = 96.dp, start = 32.dp, end = 32.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun RecommendationDetailScreenPreview() {
    AndroidStudyTheme {
        RecommendationDetailScreen(currentRecommendation = MyCityDatasource.recommendations[0])
    }
}
