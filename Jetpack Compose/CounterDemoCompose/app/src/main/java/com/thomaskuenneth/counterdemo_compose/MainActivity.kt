package com.thomaskuenneth.counterdemo_compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Dp
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.MainAxisAlignment
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import androidx.ui.text.ParagraphStyle
import androidx.ui.text.style.TextAlign

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterDemo()
        }
    }
}

@Composable
fun CounterDemo() {
    MaterialTheme {
        val counter = +state { 0 }
        Column(
            mainAxisAlignment = MainAxisAlignment.Center,
            crossAxisAlignment = CrossAxisAlignment.Center
        ) {
            Container(height = Dp(value = 200.0f),
                children = {
                    if (counter.value == 0) {
                        Text(text = "Noch nicht geklickt",
                            paragraphStyle = ParagraphStyle(textAlign = TextAlign.Center),
                            style = +themeTextStyle { h3 })
                    } else {
                        Text(text = "${counter.value}",
                            style = +themeTextStyle { h1 })
                    }
                }
            )
            Button(text = "Klick", onClick = { counter.value++ })
        }
    }
}