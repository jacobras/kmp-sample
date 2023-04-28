import androidx.compose.ui.window.Window
import co.touchlab.kermit.Logger
import nl.jacobras.kmpsample.sharedui.HelloWorld
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    Logger.i { "Kermit works!" }

    onWasmReady {
        Window {
            HelloWorld()
        }
    }
}