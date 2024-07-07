package com.example.androidstudy.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.R
import com.example.androidstudy.data.TopicDatasource
import com.example.androidstudy.model.Topic
import com.example.androidstudy.ui.theme.AndroidStudyTheme

/**
 * 12. コース一覧アプリの作成
 */
@Composable
fun CoursesScreen() {
    Courses(modifier = Modifier.padding(8.dp))
}

@Composable
private fun Courses(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(TopicDatasource.topics) { topic ->
            Topic(topic)
        }
    }
}

@Composable
private fun Topic(topic: Topic) {
    Card {
        Row {
            Image(
                painter = painterResource(id = topic.imageRes),
                contentDescription = stringResource(id = topic.titleRes),
                modifier = Modifier.size(68.dp)
            )
            Column {
                Text(
                    text = stringResource(id = topic.titleRes),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 16.dp, start = 16.dp, bottom = 8.dp),
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier.padding(start = 16.dp, end = 8.dp),
                    )
                    Text(
                        text = topic.courseCount.toString(),
                        style = MaterialTheme.typography.labelMedium,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CoursesScreenPreview() {
    AndroidStudyTheme {
        CoursesScreen()
    }
}
