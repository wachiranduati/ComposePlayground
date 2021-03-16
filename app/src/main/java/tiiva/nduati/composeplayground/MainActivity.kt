package tiiva.nduati.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tiiva.nduati.composeplayground.ui.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myApp{
//                Greeting("Android plus Nick")
                myScreenshotContent()
            }
        }
    }

}
@Composable
fun myScreenshotContent(names: List<String> = listOf("Android","there")) {
    Column {
        for(name in names){
            Greeting(name = name)
            Divider(color = Color.Black)
        }
    }
}

@Composable
fun myApp(content: @Composable () -> Unit) {
    ComposePlaygroundTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = Color.Yellow) {
            content()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", Modifier.padding(24.dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    myApp{
//        Greeting("Android plus Nick")
        myScreenshotContent()
    }
}