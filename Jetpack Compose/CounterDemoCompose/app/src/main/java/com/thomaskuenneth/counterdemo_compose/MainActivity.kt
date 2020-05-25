package com.thomaskuenneth.counterdemo_compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Alignment.Companion.CenterHorizontally
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.text.style.TextAlign

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                CounterDemo()
            }
        }
    }
}

@Model
class CounterState(var counter: Int = 0)

@Composable
fun Counter(state: CounterState) {
    Column(
        horizontalGravity = CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

            if (state.counter == 0) {
                Text(
                    text = "Noch nicht geklickt",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.h3
//                    paragraphStyle = ParagraphStyle(textAlign = TextAlign.Center),
                )
            } else {
                Text(
                    text = "${state.counter}",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.h1
                )
            }
        }
        Button(
            onClick = { state.counter++ }) {
            Text("Klick")

    }
}

@Composable
fun CounterDemo() {
    Counter(state = CounterState())
}