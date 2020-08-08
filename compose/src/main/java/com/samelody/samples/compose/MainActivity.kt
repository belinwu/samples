package com.samelody.samples.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Box
import androidx.compose.foundation.ContentGravity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier.fillMaxSize(),
                gravity = ContentGravity.Center,
                children = {
                    SimpleText("Jetpack Compose Sample")
                }
            )
        }
    }
}

@Composable
fun SimpleText(displayText: String) {
    Text(text = displayText)
}


@Preview
@Composable
fun SimpleTextPreview() {
    SimpleText("Jetpack Compose Sample")
}