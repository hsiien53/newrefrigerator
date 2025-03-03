package tw.pu.edu.csim.hsiien.newrefrigerator

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tw.pu.edu.csim.hsiien.newrefrigerator.ui.theme.NewrefrigeratorTheme
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ✅ 初始化 Firebase 應該在最前面
        FirebaseApp.initializeApp(this)

        // ✅ 測試 Firebase Authentication
        val auth = FirebaseAuth.getInstance()
        Log.d("FirebaseTest", "Firebase 初始化成功: ${auth.currentUser}")

        enableEdgeToEdge()
        setContent {
            NewrefrigeratorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello123 嫺桑!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewrefrigeratorTheme {
        Greeting("Android")
    }
}
