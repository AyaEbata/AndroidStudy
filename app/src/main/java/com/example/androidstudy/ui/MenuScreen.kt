package com.example.androidstudy.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.R
import com.example.androidstudy.ui.theme.AndroidStudyTheme

@Composable
fun MenuScreen(
    onGreetingButtonClicked: () -> Unit,
    onBirthdayCardButtonClicked: () -> Unit,
    onBirthdayCardWithImageButtonClicked: () -> Unit,
    onArticleButtonClicked: () -> Unit,
    onCompletedTaskButtonClicked: () -> Unit,
    onQuarterButtonClicked: () -> Unit,
    onDiceRollerButtonClicked: () -> Unit,
    onLemonadeButtonClicked: () -> Unit,
    onTipTimeButtonClicked: () -> Unit,
    onImageButtonClicked: () -> Unit,
    onAffirmationsButtonClicked: () -> Unit,
    onCoursesButtonClicked: () -> Unit,
    onWoofButtonClicked: () -> Unit,
    onSuperheroesButtonClicked: () -> Unit,
    onThirtyDaysButtonClicked: () -> Unit,
    onMyCityButtonClicked: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = onGreetingButtonClicked) {
            Text(text = stringResource(R.string.greeting_button))
        }
        Button(onClick = onBirthdayCardButtonClicked) {
            Text(text = stringResource(R.string.birthday_card_button))
        }
        Button(onClick = onBirthdayCardWithImageButtonClicked) {
            Text(text = stringResource(R.string.birthday_card_with_image_button))
        }
        Button(onClick = onArticleButtonClicked) {
            Text(text = stringResource(R.string.article_button))
        }
        Button(onClick = onCompletedTaskButtonClicked) {
            Text(
                text = stringResource(R.string.completed_task_button),
                textAlign = TextAlign.Center
            )
        }
        Button(onClick = onQuarterButtonClicked) {
            Text(text = stringResource(R.string.quarter_button))
        }
        Button(onClick = onDiceRollerButtonClicked) {
            Text(text = stringResource(R.string.dice_roller_button))
        }
        Button(onClick = onLemonadeButtonClicked) {
            Text(text = stringResource(R.string.lemonade_button))
        }
        Button(onClick = onTipTimeButtonClicked) {
            Text(text = stringResource(R.string.tip_time_button))
        }
        Button(onClick = onImageButtonClicked) {
            Text(text = stringResource(R.string.image_button))
        }
        Button(onClick = onAffirmationsButtonClicked) {
            Text(text = stringResource(R.string.affirmations_button))
        }
        Button(onClick = onCoursesButtonClicked) {
            Text(text = stringResource(R.string.courses_button))
        }
        Button(onClick = onWoofButtonClicked) {
            Text(text = stringResource(R.string.woof_button))
        }
        Button(onClick = onSuperheroesButtonClicked) {
            Text(text = stringResource(R.string.superheroes_button))
        }
        Button(onClick = onThirtyDaysButtonClicked) {
            Text(text = stringResource(R.string.thirty_days_button))
        }
        Text(
            text = stringResource(R.string.dessert_clicker_text),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(text = stringResource(R.string.dessert_clicker_description))
        Text(
            text = stringResource(R.string.unscramble_text),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(text = stringResource(R.string.unscramble_description))
        Text(
            text = stringResource(R.string.cupcake_text),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(text = stringResource(R.string.cupcake_description))
        Text(
            text = stringResource(R.string.lunch_tray_text),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(text = stringResource(R.string.lunch_tray_description))
        Text(
            text = stringResource(R.string.reply_text),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(text = stringResource(R.string.reply_description))
        Text(
            text = stringResource(R.string.sports_text),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.sports_description),
            modifier = Modifier.padding(bottom = 24.dp)
        )
        Button(onClick = onMyCityButtonClicked) {
            Text(text = stringResource(R.string.my_city_button))
        }
        Text(
            text = stringResource(R.string.race_tracker_text),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.race_tracker_description),
            modifier = Modifier.padding(bottom = 24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MenuScreenPreview() {
    AndroidStudyTheme {
        MenuScreen(
            onGreetingButtonClicked = {},
            onBirthdayCardButtonClicked = {},
            onBirthdayCardWithImageButtonClicked = {},
            onArticleButtonClicked = {},
            onCompletedTaskButtonClicked = {},
            onQuarterButtonClicked = {},
            onDiceRollerButtonClicked = {},
            onLemonadeButtonClicked = {},
            onTipTimeButtonClicked = {},
            onImageButtonClicked = {},
            onAffirmationsButtonClicked = {},
            onCoursesButtonClicked = {},
            onWoofButtonClicked = {},
            onSuperheroesButtonClicked = {},
            onThirtyDaysButtonClicked = {},
            onMyCityButtonClicked = {},
        )
    }
}
