package nl.jacobras.kmpsample.sharedui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import nl.jacobras.kmpsample.domain.KmpDomainShouter

/**
 * Example Composable used by the Android/Desktop/Web projects.
 */
@Composable
fun HelloWorld() {
    val shouter = KmpDomainShouter()
    var count: Int by remember { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxSize().background(Color.LightGray).padding(25.dp)) {
        Button(onClick = { count -= 1 }) {
            Text("-")
        }

        Text(modifier = Modifier.padding(15.dp), text = count.toString())
        Text("Shout: ${shouter.shout()}")

        Button(onClick = { count += 1 }) {
            Text("+")
        }
    }
}