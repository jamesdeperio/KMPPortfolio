import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform


enum class WorkImage {
    COLLABERA,
    STRATPOINT,
    NYXSYS
}
@Composable
expect fun rememberImagePainter(workImage: WorkImage): Painter