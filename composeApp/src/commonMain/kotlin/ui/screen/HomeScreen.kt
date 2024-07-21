
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BackdropScaffold
import androidx.compose.material.BackdropValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.rememberBackdropScaffoldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen


object HomeScreen:Screen  {
    @OptIn(ExperimentalMaterialApi::class)
    @Composable
    override fun Content() {
        val scaffoldState = rememberBackdropScaffoldState(BackdropValue.Revealed)
        BackdropScaffold(
            scaffoldState = scaffoldState,
            appBar = {
            },
            backLayerBackgroundColor = Color.DarkGray,
            frontLayerScrimColor = Color.Transparent,
            backLayerContent = {
                Column(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(16.dp)
                ) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Image(
                        painter = ColorPainter(Color.Gray),
                        contentDescription = "Circular Image",
                        modifier = Modifier
                            .size(60.dp,60.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Hi There!", fontSize = 24.sp, color = MaterialTheme.colors.onPrimary)
                    Spacer(modifier = Modifier.height(8.dp))
                }
            },
            frontLayerContent = {
                Column(
                    modifier = Modifier
                        .wrapContentSize()
                        .background(MaterialTheme.colors.background)
                        .padding(16.dp)
                ) {
                    Text("I'm James de Perio", fontSize = 15.sp, color = Color.Black)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("\tI've been an Android developer for almost 7 years. " +
                            "I am proficient in Java and Kotlin for mobile development. \n" +
                            "\n\tI have experience working in the financial banking, telecommunications, and advertising industries.\n" +
                            "\n\tI have also handled Android-based  projects from scratch like " +
                            "assets and inventory using RFID and barcode technology, " +
                            " digital signage app installed in postbox and android tv box," +
                            "and bus passenger identification using NFC.",
                        fontSize = 15.sp,
                        color = Color.Black)
                    Spacer(modifier = Modifier.height(15.dp))
                    Text("Educational Background:",fontSize = 15.sp, color = Color.Black)
                    Text("BS. Information Technology\n" +
                            "Graduated on April 2017", fontSize = 15.sp, color = Color.Black)
                }
            }
        )
    }

}