package com.appsogood.cardlookup.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object Settings : Screen("settings_screen")
    object About : Screen("about_screen")
}