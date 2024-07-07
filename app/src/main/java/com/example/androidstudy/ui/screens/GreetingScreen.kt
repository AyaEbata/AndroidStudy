package com.example.androidstudy.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.ui.theme.AndroidStudyTheme

/**
 * 1. 自己紹介カードの作成
 */
@Composable
fun GreetingScreen() {
    Surface(color = MaterialTheme.colorScheme.background) {
        Greeting("Aya")
    }
}

@Composable
private fun Greeting(name: String) {
    // Surface は、外観（背景色や枠線など）を変更できる UI のセクションを表すコンテナ。
    Surface(color = Color.Magenta) {
        Text(
            text = "Hi, my name is $name!",
            modifier = Modifier.padding(24.dp)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "greeting",
)
@Composable
private fun GreetingScreenPreview() {
    AndroidStudyTheme {
        GreetingScreen()
    }
}
