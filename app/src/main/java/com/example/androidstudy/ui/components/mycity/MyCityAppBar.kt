package com.example.androidstudy.ui.components.mycity

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidstudy.R
import com.example.androidstudy.ui.theme.AndroidStudyTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCityAppBar(canNavigateBack: Boolean, onBackButtonClicked: () -> Unit, @StringRes title: Int) {
    TopAppBar(
        title = { Text(text = stringResource(id = title)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = onBackButtonClicked) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button),
                    )
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MyCityAppBarPreview() {
    AndroidStudyTheme {
        MyCityAppBar(
            canNavigateBack = true,
            onBackButtonClicked = {},
            title = R.string.my_city_app_title,
        )
    }
}
