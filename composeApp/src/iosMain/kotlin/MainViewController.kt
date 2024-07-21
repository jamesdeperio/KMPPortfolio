import androidx.compose.ui.window.ComposeUIViewController
import di.initKoin


fun MainViewController() {
    initKoin()
    ComposeUIViewController { App(false) }
}