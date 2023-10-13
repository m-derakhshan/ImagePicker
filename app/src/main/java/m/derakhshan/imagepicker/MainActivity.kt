package m.derakhshan.imagepicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import m.derakhshan.imagepicker.ui.theme.ImagePickerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagePickerTheme {
            }
        }
    }
}