package com.example.androidstudy.ui.mycity

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidstudy.model.Category
import com.example.androidstudy.ui.components.mycity.CategoriesList
import com.example.androidstudy.ui.theme.AndroidStudyTheme

@Composable
fun CategoriesScreen(
    navigateToRecommendations: () -> Unit,
    updateCurrentCategory: (Category) -> Unit
) {
    // 今回は入れないけど、戻るボタンで制御したい時入れる！
    // 以下を渡すとアプリ終わらせられる
    // val activity = LocalContext.current as Activity
    // activity.finish()
//    BackHandler {
//        onBackPressed()
//    }

    CategoriesList(onClick = {
        updateCurrentCategory(it)
        navigateToRecommendations()
    })
}

@Preview(showBackground = true)
@Composable
private fun CategoriesScreenPreview() {
    AndroidStudyTheme {
        CategoriesScreen(navigateToRecommendations = {}, updateCurrentCategory = {})
    }
}
