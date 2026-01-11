package be.ehb.japanguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import be.ehb.japanguide.ui.screens.AttractionDetailScreen
import be.ehb.japanguide.ui.screens.CitiesScreen
import be.ehb.japanguide.ui.screens.CityDetailScreen
import be.ehb.japanguide.ui.screens.FoodScreen
import be.ehb.japanguide.ui.screens.HomeScreen
import be.ehb.japanguide.ui.screens.PhrasesScreen
import be.ehb.japanguide.ui.theme.JapanGuideTheme

enum class Routes {
    Home,
    Cities,
    CityDetail,
    AttractionDetail,
    Food,
    Phrases
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            JapanGuideTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    JapanGuideApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun JapanGuideApp(
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Home.name
    ) {
        composable(Routes.Home.name) {
            HomeScreen(
                modifier = modifier,
                onCategoryClick = { route ->
                    navController.navigate(route.name)
                }
            )
        }

        composable(Routes.Cities.name) {
            CitiesScreen(
                modifier = modifier,
                onCityClick = { cityId ->
                    navController.navigate("${Routes.CityDetail.name}/$cityId")
                },
                onBack = { navController.popBackStack() }
            )
        }

        composable(
            route = "${Routes.CityDetail.name}/{cityId}",
            arguments = listOf(navArgument("cityId") { type = NavType.StringType })
        ) { entry ->
            val cityId = entry.arguments?.getString("cityId") ?: return@composable
            CityDetailScreen(
                cityId = cityId,
                modifier = modifier,
                onAttractionClick = { attractionId ->
                    navController.navigate("${Routes.AttractionDetail.name}/$attractionId")
                },
                onBack = { navController.popBackStack() }
            )
        }

        composable(
            route = "${Routes.AttractionDetail.name}/{attractionId}",
            arguments = listOf(navArgument("attractionId") { type = NavType.StringType })
        ) { entry ->
            val attractionId = entry.arguments?.getString("attractionId") ?: return@composable
            AttractionDetailScreen(
                attractionId = attractionId,
                modifier = modifier,
                onBack = { navController.popBackStack() }
            )
        }

        composable(Routes.Food.name) {
            FoodScreen(
                modifier = modifier,
                onBack = { navController.popBackStack() }
            )
        }

        composable(Routes.Phrases.name) {
            PhrasesScreen(
                modifier = modifier,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
