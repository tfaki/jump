package com.android.jump

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.android.jump.ui.theme.JumpTheme
import com.tfaki.jump.BounceType
import com.tfaki.jump.Jump

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JumpTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Jump(
                        toDirection = 150,
                        bounceType = BounceType.HIGH_BOUNCE,
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Button(onClick = { }) {
                            Text(text = "Jumping Button")
                        }
                    }
                }
            }
        }
    }
}