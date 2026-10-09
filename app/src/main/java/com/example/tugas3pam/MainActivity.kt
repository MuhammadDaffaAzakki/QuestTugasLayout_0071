package com.example.tugas3pam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tugas3pam.ui.screens.MainScreen
import com.example.tugas3pam.ui.theme.Tugas3PAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tugas3PAMTheme {
                MainScreen()
            }
        }
    }
}
