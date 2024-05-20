package com.example.androidstudy.ui.mycity.test

import com.example.androidstudy.data.MyCityDatasource
import com.example.androidstudy.ui.mycity.MyCityViewModel
import org.junit.Assert.assertEquals
import org.junit.Test

class MyCityViewModelTest {
    private val viewModel = MyCityViewModel()

    @Test
    fun updateCurrentCategory() {
        viewModel.updateCurrentCategory(MyCityDatasource.categories[1])

        val currentUiState = viewModel.uiState.value
        assertEquals(MyCityDatasource.categories[1], currentUiState.currentCategory)
    }

    @Test
    fun updateCurrentRecommendation() {
        viewModel.updateCurrentRecommendation(MyCityDatasource.recommendations[1])

        val currentUiState = viewModel.uiState.value
        assertEquals(MyCityDatasource.recommendations[1], currentUiState.currentRecommendation)
    }
}