package com.appsogood.cardlookup.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.appsogood.cardlookup.screens.AboutScreen
import com.appsogood.cardlookup.screens.HomeScreen
import com.appsogood.cardlookup.screens.SettingsScreen

@Composable
fun NavigationSetup(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.route) {
        composable(BottomNavItem.Home.route) {
            HomeScreen()
        }
        composable(BottomNavItem.Settings.route) {
            SettingsScreen(navController)
        }
        composable(Screen.About.route) {
            AboutScreen()
        }
    }
}