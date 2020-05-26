package com.thomaskuenneth.counterdemo_compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Alignment.Companion.Center
import androidx.ui.core.Alignment.Companion.CenterHorizontally
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Typography
import androidx.ui.text.style.TextAlign
import androidx.ui.unit.dp

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
class CounterState(var counter: Int)

@Composable
fun CounterDemo() {
    val state = CounterState(0)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalGravity = CenterHorizontally
    )
    {
        Box(
            gravity = Center,
            padding = 16.dp,
            modifier = Modifier.height(200.dp)
        ) {
            CountText(state)
        }
        CountButton(state)
    }
}

@Composable
fun CountText(state: CounterState) {
    val typography = Typography()
    if (state.counter == 0) {
        Text(
            text = "Noch nicht geklickt",
            softWrap = true,
            textAlign = TextAlign.Center,
            style = typography.h3
        )
    } else {
        Text(
            text = "${state.counter}",
            textAlign = TextAlign.Center,
            style = typography.h1
        )
    }
}

@Composable
fun CountButton(state: CounterState) {
    Button(
        onClick = { state.counter++ }) {
        Text(text = "Klick")
    }
}