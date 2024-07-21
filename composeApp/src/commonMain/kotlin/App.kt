
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.component.AppNavigationBar
import ui.screen.ExperienceScreen
import ui.screen.PortfolioScreen
import ui.screen.SkillScreen
import ui.theme.AppTheme


@Composable
@Preview
fun App(
    dynamicColor: Boolean = false) {
    var selectedItem by remember { mutableIntStateOf(0) }
    AppTheme(
        dynamicColor = dynamicColor
    ) {

        Scaffold(
            bottomBar = {
                if (selectedItem!=-1) {
                    AppNavigationBar { selectedItem = it }
                }
            }

        ) { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                when (selectedItem) {
                    0 -> Navigator(HomeScreen)
                    1 -> Navigator(ExperienceScreen {
                    }) { navigator ->
                        SlideTransition(navigator)
                    }

                    2 -> SkillScreen()
                    3 -> PortfolioScreen()
                }
            }
        }
    }

}

data class NavigationState(
    var selectedNavigationIndex:Int = 0
)


class MainScreenViewModel: ViewModel() {
    private val _state = MutableStateFlow(NavigationState())
    val state = _state.asStateFlow()
}