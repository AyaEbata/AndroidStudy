package com.example.androidstudy.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.R
import com.example.androidstudy.ui.components.ThirtyDaysList
import com.example.androidstudy.ui.theme.AndroidStudyTheme
import com.example.androidstudy.ui.theme.ThirtyDaysTheme

/**
 * 15. 30日間アプリ
 */
@Composable
fun ThirtyDaysScreen() {
    ThirtyDaysTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            ThirtyDaysApp()
        }
    }
}

@Composable
private fun ThirtyDaysApp() {
    Scaffold(topBar = { ThirtyDaysTopBar() }) {
        Surface(modifier = Modifier.padding(it)) {
            ThirtyDaysList(modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ThirtyDaysTopBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.thirty_days_of_android),
                style = MaterialTheme.typography.displayLarge,
            )
        },
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
private fun ThirtyDaysScreenPreview() {
    AndroidStudyTheme {
        ThirtyDaysScreen()
    }
}
