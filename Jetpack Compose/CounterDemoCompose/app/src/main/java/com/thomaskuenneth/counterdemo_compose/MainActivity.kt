package com.thomaskuenneth.counterdemo_compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

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

@Composable
fun CounterDemo() {
    val state = remember { mutableStateOf(0) }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = CenterHorizontally
    )
    {
        Box(
            alignment = Center,
            modifier = Modifier.height(200.dp)
        ) {
            CountText(state.value)
        }
        CountButton(state)
    }
}

@Composable
fun CountText(value: Int) {
    val typography = Typography()
    if (value == 0) {
        Text(
            text = "Noch nicht geklickt",
            softWrap = true,
            textAlign = TextAlign.Center,
            style = typography.h3
        )
    } else {
        Text(
            text = "$value",
            textAlign = TextAlign.Center,
            style = typography.h1
        )
    }
}

@Composable
fun CountButton(state: MutableState<Int>) {
    Button(
        onClick = { state.value++ }) {
        Text(text = "Klick")
    }
}

@Composable
@Preview
fun Preview() {
    CounterDemo()
}