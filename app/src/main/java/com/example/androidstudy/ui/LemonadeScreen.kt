package com.example.androidstudy.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.R
import com.example.androidstudy.ui.theme.AndroidStudyTheme

/**
 * 8. Lemonadeアプリの作成
 */
@Composable
fun LemonadeScreen() {
    LemonadeApp()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun LemonadeApp() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = Color.Yellow,
                    titleContentColor = Color.Black,
                ),
                title = {
                    Text(
                        text = "Lemonade",
                        fontWeight = FontWeight.Bold,
                    )
                }
            )
        },
    ) { innerPadding ->
        Lemonade(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .wrapContentSize(Alignment.Center)
        )
    }
}

@Composable
private fun Lemonade(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        LemonadeImageButton()
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = stringResource(id = R.string.lemon_tree_description))
    }
}

@Composable
private fun LemonadeImageButton() {
    var step by remember { mutableIntStateOf(1) }
    var squeeze by remember { mutableIntStateOf(0) }

    Button(
        colors = ButtonDefaults.textButtonColors(Color(0xFFAFE1AF)),
        shape = RoundedCornerShape(24.dp),
        onClick = {
            when (step) {
                1 -> {
                    step++
                    squeeze = (1..10).random()
                }

                2 -> if (squeeze == 1) step++ else squeeze--
                3 -> step++
                4 -> step = 1
            }
        },
    ) {
        Image(
            painter = painterResource(id = lemonadeImage(step)),
            contentDescription = stringResource(id = R.string.lemon_tree),
        )
    }
}

private fun lemonadeImage(step: Int): Int {
    return when (step) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        4 -> R.drawable.lemon_restart
        else -> 0
    }
}

@Preview(showBackground = true)
@Composable
private fun LemonadeScreenPreview() {
    AndroidStudyTheme {
        LemonadeScreen()
    }
}
