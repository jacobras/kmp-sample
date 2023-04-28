import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import nl.jacobras.kmpsample.sharedui.HelloWorld

@Composable
@Preview
fun App() {
    HelloWorld()
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}