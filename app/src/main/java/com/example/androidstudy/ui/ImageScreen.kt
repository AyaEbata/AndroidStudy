package com.example.androidstudy.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.data.ImageInfoDatasource
import com.example.androidstudy.model.ImageInfo
import com.example.androidstudy.ui.theme.AndroidStudyTheme

/**
 * 10. 画像アプリの作成
 */
@Composable
fun ImageScreen() {
    ImageApp()
}

@Composable
fun ImageApp() {
    var imageNumber by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ImageContainer(
            imageNumber = imageNumber,
            modifier = Modifier
                .weight(1f)
                .wrapContentHeight(),
        )
        ButtonContainer(
            next = { if (imageNumber < 2) imageNumber++ },
            previous = { if (imageNumber > 0) imageNumber-- }
        )
    }
}

@Composable
fun ImageContainer(imageNumber: Int, modifier: Modifier = Modifier) {
    val images = ImageInfoDatasource.load()

    Column(modifier = modifier.width(320.dp)) {
        Image(
            painter = painterResource(id = images[imageNumber].image),
            contentDescription = images[imageNumber].title,
            modifier = Modifier
                .shadow(8.dp)
                .padding(40.dp),
        )
        Spacer(modifier = Modifier.height(32.dp))
        Surface(modifier = Modifier.padding(horizontal = 8.dp)) {
            Description(images[imageNumber])
        }
    }
}

@Composable
fun Description(imageInfo: ImageInfo) {
    Column(
        modifier = Modifier
            .background(color = Color(0xFFECEBF3))
            .padding(16.dp)
            .fillMaxWidth(),
    ) {
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append(imageInfo.artist)
                }
                append(" (${imageInfo.year})")
            }
        )
    }
}

@Composable
fun ButtonContainer(next: () -> Unit, previous: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Button(
            colors = ButtonDefaults.textButtonColors(
                containerColor = Color(0xFF4D5C8E),
                contentColor = Color.White,
            ),
            onClick = { previous() },
        ) {
            Text(text = "Previous")
        }
        Button(
            colors = ButtonDefaults.textButtonColors(
                containerColor = Color(0xFF4D5C8E),
                contentColor = Color.White,
            ),
            onClick = { next() },
        ) {
            Text(text = "Next")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImageScreenPreview() {
    AndroidStudyTheme {
        ImageScreen()
    }
}
