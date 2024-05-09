package com.example.androidstudy

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
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidstudy.ui.AffirmationsScreen
import com.example.androidstudy.ui.ArticleScreen
import com.example.androidstudy.ui.BirthdayCardScreen
import com.example.androidstudy.ui.BirthdayCardWithImageScreen
import com.example.androidstudy.ui.CompletedTaskScreen
import com.example.androidstudy.ui.CoursesScreen
import com.example.androidstudy.ui.DiceRollerScreen
import com.example.androidstudy.ui.GreetingScreen
import com.example.androidstudy.ui.ImageScreen
import com.example.androidstudy.ui.LemonadeScreen
import com.example.androidstudy.ui.MenuScreen
import com.example.androidstudy.ui.QuarterScreen
import com.example.androidstudy.ui.SuperheroesScreen
import com.example.androidstudy.ui.ThirtyDaysScreen
import com.example.androidstudy.ui.components.ThirtyDaysList
import com.example.androidstudy.ui.TipTimeScreen
import com.example.androidstudy.ui.WoofScreen
import com.example.androidstudy.ui.theme.ThirtyDaysTheme

enum class AndroidStudyScreen {
    Menu,
    Greeting,
    BirthdayCard,
    BirthdayCardWithImage,
    Article,
    CompletedTask,
    Quarter,
    DiceRoller,
    Lemonade,
    TipTime,
    Image,
    Affirmations,
    Courses,
    Woof,
    Superheroes,
    ThirtyDays,
}

@Composable
fun AndroidStudioApp(navController: NavHostController = rememberNavController()) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = AndroidStudyScreen.Menu.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = AndroidStudyScreen.Menu.name) {
                MenuScreen(
                    onGreetingButtonClicked = { navController.navigate(AndroidStudyScreen.Greeting.name) },
                    onBirthdayCardButtonClicked = { navController.navigate(AndroidStudyScreen.BirthdayCard.name) },
                    onBirthdayCardWithImageButtonClicked = {
                        navController.navigate(
                            AndroidStudyScreen.BirthdayCardWithImage.name
                        )
                    },
                    onArticleButtonClicked = { navController.navigate(AndroidStudyScreen.Article.name) },
                    onCompletedTaskButtonClicked = { navController.navigate(AndroidStudyScreen.CompletedTask.name) },
                    onQuarterButtonClicked = { navController.navigate(AndroidStudyScreen.Quarter.name) },
                    onDiceRollerButtonClicked = { navController.navigate(AndroidStudyScreen.DiceRoller.name) },
                    onLemonadeButtonClicked = { navController.navigate(AndroidStudyScreen.Lemonade.name) },
                    onTipTimeButtonClicked = { navController.navigate(AndroidStudyScreen.TipTime.name) },
                    onImageButtonClicked = { navController.navigate(AndroidStudyScreen.Image.name) },
                    onAffirmationsButtonClicked = { navController.navigate(AndroidStudyScreen.Affirmations.name) },
                    onCoursesButtonClicked = { navController.navigate(AndroidStudyScreen.Courses.name) },
                    onWoofButtonClicked = { navController.navigate(AndroidStudyScreen.Woof.name) },
                    onSuperheroesButtonClicked = { navController.navigate(AndroidStudyScreen.Superheroes.name) },
                    onThirtyDaysButtonClicked = { navController.navigate(AndroidStudyScreen.ThirtyDays.name) },
                )
            }
            composable(route = AndroidStudyScreen.Greeting.name) {
                GreetingScreen()
            }
            composable(route = AndroidStudyScreen.BirthdayCard.name) {
                BirthdayCardScreen()
            }
            composable(route = AndroidStudyScreen.BirthdayCardWithImage.name) {
                BirthdayCardWithImageScreen()
            }
            composable(route = AndroidStudyScreen.Article.name) {
                ArticleScreen()
            }
            composable(route = AndroidStudyScreen.CompletedTask.name) {
                CompletedTaskScreen()
            }
            composable(route = AndroidStudyScreen.Quarter.name) {
                QuarterScreen()
            }
            composable(route = AndroidStudyScreen.DiceRoller.name) {
                DiceRollerScreen()
            }
            composable(route = AndroidStudyScreen.Lemonade.name) {
                LemonadeScreen()
            }
            composable(route = AndroidStudyScreen.TipTime.name) {
                TipTimeScreen()
            }
            composable(route = AndroidStudyScreen.Image.name) {
                ImageScreen()
            }
            composable(route = AndroidStudyScreen.Affirmations.name) {
                AffirmationsScreen()
            }
            composable(route = AndroidStudyScreen.Courses.name) {
                CoursesScreen()
            }
            composable(route = AndroidStudyScreen.Woof.name) {
                WoofScreen()
            }
            composable(route = AndroidStudyScreen.Superheroes.name) {
                SuperheroesScreen()
            }
            composable(route = AndroidStudyScreen.ThirtyDays.name) {
                ThirtyDaysScreen()
            }
        }
    }
}
