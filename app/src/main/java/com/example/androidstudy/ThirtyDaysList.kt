package com.example.androidstudy

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.data.ThirtyDaysDatasource
import com.example.androidstudy.model.OneDay
import com.example.androidstudy.ui.theme.ThirtyDaysTheme

@Composable
fun ThirtyDaysList(modifier: Modifier = Modifier) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier,
    ) {
        itemsIndexed(ThirtyDaysDatasource.thirtyDays) { index, item ->
            ThirtyDaysPanel(index = index + 1, oneDay = item)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirtyDaysPanel(index: Int, oneDay: OneDay, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    Card(modifier = modifier, onClick = { expanded = !expanded }) {
        Column(modifier = Modifier.padding(32.dp).animateContentSize()) {
            Text(
                text = "Day $index",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 16.dp),
            )
            Text(
                text = stringResource(id = oneDay.titleRes),
                style = MaterialTheme.typography.bodyLarge,
            )
            Image(
                painter = painterResource(id = oneDay.imageRes),
                contentDescription = stringResource(id = oneDay.titleRes),
            )
            if (expanded) {
                Text(
                    text = stringResource(id = oneDay.descriptionRes),
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
        }
    }
}

@Preview
@Composable
fun ThirtyDaysPanelPreview() {
    ThirtyDaysTheme {
        ThirtyDaysPanel(1, OneDay(R.string.day1_title, R.string.day1_description, R.drawable.day1))
    }
}

@Preview(showBackground = true)
@Composable
fun ThirtyDaysListPreview() {
    ThirtyDaysTheme {
        ThirtyDaysList()
    }
}