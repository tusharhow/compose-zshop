package com.example.zshop.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.zshop.views.AnimatedSplashScreen


@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            AnimatedSplashScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomePage()
        }
    }
}

@Composable
fun HomePage() {
    val products = listOf(
        "Product 1",
        "Product 2",
        "Product 3",
        "Product 4",
        "Product 5",
        "Product 6",
        "Product 7",
        "Product 8",
        "Product 9",
        "Product 10",
        "Product 11",
        "Product 12",
        "Product 13",
        "Product 14",
        "Product 15",
        "Product 16",
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
    ) {
        Text(
            text = "ZShop",
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
            ), fontWeight = FontWeight.Black
        )

        LazyColumn {
            items(products) { product ->
                Box(modifier = Modifier
                    .height(60.dp)
                    .fillMaxWidth()
                    .background(Color.Gray)
                    .clickable {
                        println(product)
                    }
                ) {
                    Text(
                        text = product,
                        modifier = Modifier.padding(10.dp).align(Alignment.CenterStart),
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 18.sp,
                        ),
                    )
                }
                Divider()
            }

        }
    }
}


