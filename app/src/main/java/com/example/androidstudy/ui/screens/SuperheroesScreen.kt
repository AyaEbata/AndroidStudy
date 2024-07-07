package com.example.androidstudy.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.R
import com.example.androidstudy.ui.theme.AndroidStudyTheme
import com.example.androidstudy.ui.theme.SuperheroesTheme

/**
 * 14. Superheroesアプリ
 */
@Composable
fun SuperheroesScreen() {
    SuperheroesTheme {
        SuperheroesApp()
    }
}

@Composable
private fun SuperheroesApp() {
    Scaffold(topBar = { SuperheroesTopBar() }) {
        HeroesScreen(contentPadding = it, modifier = Modifier.padding(16.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SuperheroesTopBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.superheroes),
                style = MaterialTheme.typography.displayLarge,
            )
        },
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
private fun SuperheroesScreenPreview() {
    AndroidStudyTheme {
        SuperheroesScreen()
    }
}
