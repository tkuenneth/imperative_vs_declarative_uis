import androidx.compose.desktop.Window
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
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp

fun main() = Window(title = "Compose for Desktop", size = IntSize(300, 300)) {
    MaterialTheme {
        CounterDemo()
    }
}

@Composable
fun CounterDemo() {
    val state = remember { mutableStateOf(0) }
    MaterialTheme {
        Scaffold(
                topBar = {
                    TopAppBar(
                            title = {
                                Text(text = "Hello Compose")
                            }
                    )
                }
        ) {
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
