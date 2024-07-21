
import android.os.Build
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.github.jamesdeperio.R

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()



@Composable
actual fun rememberImagePainter(workImage: WorkImage): Painter {
    return when(workImage) {
        WorkImage.COLLABERA ->  painterResource(id = R.drawable.collab)
        WorkImage.STRATPOINT -> painterResource(id = R.drawable.stratpoint)
        WorkImage.NYXSYS -> painterResource(id = R.drawable.nyxsys)
    }

}