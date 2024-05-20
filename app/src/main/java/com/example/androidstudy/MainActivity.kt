package com.example.androidstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.example.androidstudy.ui.AndroidStudyApp
import com.example.androidstudy.ui.theme.AndroidStudyTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            AndroidStudyTheme {
                val windowSize = calculateWindowSizeClass(this)
                AndroidStudyApp(widthSize = windowSize.widthSizeClass)
            }
        }
    }
}
