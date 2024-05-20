package com.example.androidstudy.ui.components.mycity

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
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
import com.example.androidstudy.model.Recommendation
import com.example.androidstudy.ui.theme.AndroidStudyTheme

@Composable
fun RecommendationDetail(currentRecommendation: Recommendation, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp),
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = stringResource(id = currentRecommendation.name), fontWeight = FontWeight.Bold, style = MaterialTheme.typography.titleLarge)
        Image(
            painter = painterResource(id = currentRecommendation.image),
            contentDescription = stringResource(id = currentRecommendation.name),
            modifier = Modifier.fillMaxWidth()
        )
        Text(text = stringResource(id = currentRecommendation.description))
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendationDetailPreview() {
    AndroidStudyTheme {
        RecommendationDetail(currentRecommendation = MyCityDatasource.recommendations[0])
    }
}
