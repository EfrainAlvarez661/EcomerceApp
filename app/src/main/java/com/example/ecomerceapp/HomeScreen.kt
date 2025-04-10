package com.example.ecomerceapp


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ecomerceapp.ui.theme.EcomerceAppTheme


@Composable
fun HomeScreen(navcontroller: NavController) {
    Scaffold { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text(text = "Home Screen", fontSize = 50.sp)
        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen(

) {
    EcomerceAppTheme {
//        HomeScreen()
    }
}