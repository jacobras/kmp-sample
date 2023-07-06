import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import co.touchlab.kermit.Logger
import nl.jacobras.kmpsample.sharedui.HelloWorld
import org.jetbrains.skiko.wasm.onWasmReady

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    Logger.i { "Kermit works!" }

    onWasmReady {
        CanvasBasedWindow("ComposeTarget") {
            HelloWorld()
        }
    }
}