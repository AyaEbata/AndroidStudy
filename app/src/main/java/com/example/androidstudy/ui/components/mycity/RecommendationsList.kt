package com.example.androidstudy.ui.components.mycity

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
import com.example.androidstudy.ui.theme.AndroidStudyTheme

@Composable
fun RecommendationsList(
    currentCategory: Category?,
    onClick: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(
            MyCityDatasource.recommendations.groupBy { it.category }[currentCategory] ?: listOf()
        ) {
            Recommendation(recommendation = it, onClick = { onClick(it) })
        }
    }
}

@Composable
private fun Recommendation(recommendation: Recommendation, onClick: () -> Unit) {
    Column {
        Row(
            modifier = Modifier
                .height(80.dp)
                .padding(8.dp)
                .fillMaxWidth()
                .clickable { onClick() },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Image(
                painter = painterResource(id = recommendation.image),
                contentDescription = stringResource(id = recommendation.name),
                modifier = Modifier.width(64.dp)
            )
            Text(text = stringResource(id = recommendation.name), fontWeight = FontWeight.Bold)
        }
        Divider()
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendationsListPreview() {
    AndroidStudyTheme {
        RecommendationsList(currentCategory = MyCityDatasource.categories[0], onClick = {})
    }
}
