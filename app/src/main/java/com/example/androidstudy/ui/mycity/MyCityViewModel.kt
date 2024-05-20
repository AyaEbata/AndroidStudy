package com.example.androidstudy.ui.mycity

import androidx.lifecycle.ViewModel
import com.example.androidstudy.data.MyCityDatasource
import com.example.androidstudy.model.Category
import com.example.androidstudy.model.Recommendation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MyCityViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(MyCityUiState())
    val uiState: StateFlow<MyCityUiState> = _uiState.asStateFlow()

    fun updateCurrentCategory(category: Category?) {
        _uiState.update {
            it.copy(currentCategory = category)
        }
    }

    fun updateCurrentRecommendation(recommendation: Recommendation) {
        _uiState.update {
            it.copy(currentRecommendation = recommendation)
        }
    }
}

data class MyCityUiState(
    val currentCategory: Category? = null,
    val currentRecommendation: Recommendation = MyCityDatasource.recommendations[0],
)
