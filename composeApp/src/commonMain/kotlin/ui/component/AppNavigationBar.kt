package ui.component


import HomeScreen
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import cafe.adriel.voyager.core.screen.Screen
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.theme.NavigationIcon

enum class MainScreenRouter(val index: Int,
                            val label: String,
                            val icon: ImageVector,
                            val screen: Screen) {
    ABOUT_ROUTE(0,"About Me", NavigationIcon.AboutMe, HomeScreen),
    EXPERIENCE_ROUTE(1,"Experience",NavigationIcon.WorkExperience,HomeScreen),
    SKILL_ROUTE(2,"Skill",NavigationIcon.Skill,HomeScreen),
    PORTFOLIO_ROUTE(3,"Portfolio",NavigationIcon.Portfolio,HomeScreen);

}


@Composable
fun AppNavigationBar(onSelectedItem: (Int) -> Unit = {}): Int {
    var selectedItem by remember { mutableIntStateOf(0) }
    NavigationBar {
        MainScreenRouter.entries.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        item.icon,
                        contentDescription = item.label
                    )
                },
                label = { Text(item.label) },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    onSelectedItem(selectedItem)
                },
                alwaysShowLabel = false
            )


        }
    }

    return selectedItem
}

@Preview
@Composable
fun TestAppNavigationBar() {
    AppNavigationBar()
}

