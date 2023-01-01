import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

private const val TITLE = "CounterDemo"

fun main() = application {
    Window(
        title = TITLE,
        onCloseRequest = ::exitApplication,
    ) {
        MaterialTheme {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = {
                            Text(text = TITLE)
                        }
                    )
                }
            ) {
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
            .fillMaxSize(),
        horizontalAlignment = CenterHorizontally
    )
    {
        Box(
            contentAlignment = Center,
            modifier = Modifier.height(200.dp)
        ) {
            CountText(state.value)
        }
        CountButton(state)
    }
}

@Composable
fun CountText(value: Int) {
    if (value == 0) {
        Text(
            text = "Noch nicht geklickt",
            softWrap = true,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h3
        )
    } else {
        Text(
            text = "$value",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h1
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
