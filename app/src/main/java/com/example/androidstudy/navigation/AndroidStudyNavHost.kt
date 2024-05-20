package com.example.androidstudy.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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
import com.example.androidstudy.ui.mycity.MyCityScreen
import com.example.androidstudy.ui.QuarterScreen
import com.example.androidstudy.ui.SuperheroesScreen
import com.example.androidstudy.ui.ThirtyDaysScreen
import com.example.androidstudy.ui.TipTimeScreen
import com.example.androidstudy.ui.WoofScreen

@Composable
fun AndroidStudyNavHost(
    navController: NavHostController,
    innerPadding: PaddingValues,
    widthSize: WindowWidthSizeClass
) {
    NavHost(
        navController = navController,
        startDestination = AndroidStudyDestination.Menu.name,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable(route = AndroidStudyDestination.Menu.name) {
            MenuScreen(
                onGreetingButtonClicked = { navController.navigate(AndroidStudyDestination.Greeting.name) },
                onBirthdayCardButtonClicked = { navController.navigate(AndroidStudyDestination.BirthdayCard.name) },
                onBirthdayCardWithImageButtonClicked = {
                    navController.navigate(
                        AndroidStudyDestination.BirthdayCardWithImage.name
                    )
                },
                onArticleButtonClicked = { navController.navigate(AndroidStudyDestination.Article.name) },
                onCompletedTaskButtonClicked = { navController.navigate(AndroidStudyDestination.CompletedTask.name) },
                onQuarterButtonClicked = { navController.navigate(AndroidStudyDestination.Quarter.name) },
                onDiceRollerButtonClicked = { navController.navigate(AndroidStudyDestination.DiceRoller.name) },
                onLemonadeButtonClicked = { navController.navigate(AndroidStudyDestination.Lemonade.name) },
                onTipTimeButtonClicked = { navController.navigate(AndroidStudyDestination.TipTime.name) },
                onImageButtonClicked = { navController.navigate(AndroidStudyDestination.Image.name) },
                onAffirmationsButtonClicked = { navController.navigate(AndroidStudyDestination.Affirmations.name) },
                onCoursesButtonClicked = { navController.navigate(AndroidStudyDestination.Courses.name) },
                onWoofButtonClicked = { navController.navigate(AndroidStudyDestination.Woof.name) },
                onSuperheroesButtonClicked = { navController.navigate(AndroidStudyDestination.Superheroes.name) },
                onThirtyDaysButtonClicked = { navController.navigate(AndroidStudyDestination.ThirtyDays.name) },
                onMyCityButtonClicked = { navController.navigate(AndroidStudyDestination.MyCity.name) },
            )
        }
        composable(route = AndroidStudyDestination.Greeting.name) {
            GreetingScreen()
        }
        composable(route = AndroidStudyDestination.BirthdayCard.name) {
            BirthdayCardScreen()
        }
        composable(route = AndroidStudyDestination.BirthdayCardWithImage.name) {
            BirthdayCardWithImageScreen()
        }
        composable(route = AndroidStudyDestination.Article.name) {
            ArticleScreen()
        }
        composable(route = AndroidStudyDestination.CompletedTask.name) {
            CompletedTaskScreen()
        }
        composable(route = AndroidStudyDestination.Quarter.name) {
            QuarterScreen()
        }
        composable(route = AndroidStudyDestination.DiceRoller.name) {
            DiceRollerScreen()
        }
        composable(route = AndroidStudyDestination.Lemonade.name) {
            LemonadeScreen()
        }
        composable(route = AndroidStudyDestination.TipTime.name) {
            TipTimeScreen()
        }
        composable(route = AndroidStudyDestination.Image.name) {
            ImageScreen()
        }
        composable(route = AndroidStudyDestination.Affirmations.name) {
            AffirmationsScreen()
        }
        composable(route = AndroidStudyDestination.Courses.name) {
            CoursesScreen()
        }
        composable(route = AndroidStudyDestination.Woof.name) {
            WoofScreen()
        }
        composable(route = AndroidStudyDestination.Superheroes.name) {
            SuperheroesScreen()
        }
        composable(route = AndroidStudyDestination.ThirtyDays.name) {
            ThirtyDaysScreen()
        }
        composable(route = AndroidStudyDestination.MyCity.name) {
            MyCityScreen(widthSize = widthSize)
        }
    }
}
