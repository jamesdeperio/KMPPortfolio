package ui.screen

import WorkImage
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import rememberImagePainter
import ui.component.WorkExperienceCard

@Immutable
data class Experience(
    val title: String,
    val subTitle: String,
    val description: String,
    val imagePainter: Painter
)
data class ExperienceScreen(private val onBack: () -> Unit):Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val list: MutableList<Experience> = ArrayList()
        list.add(Experience(
            "Collabera Digital",
            "Remote Android Developer",
            "SEPTEMBER 2021 - May 2024\n" +
                    "Deployed in an online banking project.\n" +
                    "Scope of Work:\n" +
                    "- Developed Installments feature for retail and balance conversion.\n" +
                    "- Developed Remittance Center feature revamp.\n" +
                    "- Developed Card Activation revamp.\n" +
                    "- Maintenance for forex, remittance center, card card lock/unlock and new cards roll out.\n" +
                    "- Contribute in creating reusable components for the app super app revamp.\n" +
                    "- Received a commendation from the technical lead for doing an extra mile.\n" +
                    "- Working in a cross-functional team and agile environment.",
            rememberImagePainter(WorkImage.COLLABERA)))

        list.add(Experience(
            "Stratpoint Global Outsourcing",
            "Android Software Engineer",
            "Deployed in an ISP client.\n" +
                    "Scope of Work:\n" +
                    "Developed gamification feature for promo availment.\n" +
                    "Developed dynamic seasonal takeover page feature for events and promos.\n" +
                    "Developed dynamic forms for customer throubleshooting and feedback.\n" +
                    "Developed activation flow for the new internet modem to access messages from the modem portal.\n" +
                    "Contribute in creating reusable components for the app super app revamp.\n" +
                    "Endorse to migrate the project from Java to Kotlin.\n" +
                    "Lead the Android Development team for 8 months.\n" +
                    "Received a Certificate of Recognition from the client for being the \"Most Reliable Developer\" of the year.\n" +
                    "Recognized in Stratpoint 2020 WOOT Awardees and received a \"Team Player Award\".\n" +
                    "Promoted to Senior level Android Software Engineer on February 2020.\n" +
                    "Working in a cross-functional team and agile environment.",
            rememberImagePainter(WorkImage.STRATPOINT)))


        list.add(Experience(
            "NYXSYS PH",
            "Android Developer",
            "JULY 2017 - FEBRUARY 2019\n" +
                    "Working as a solo android developer.\n" +
                    "Scope of Work:\n" +
                    "Developed an android-based digital signage application installed in posterbox or android tv.\n" +
                    "Developed an assets and inventory application integrated in Zebra Technology handheld RFID and Barcode scanner.\n" +
                    "Developed customer satisfaction application for kiosk.\n" +
                    "Received a \"Certificate of Commendation\" for encouraging the development team to join hackathon event.\n" +
                    "Working in waterfall environment.",
            rememberImagePainter(WorkImage.NYXSYS)))

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(list) { item ->
                WorkExperienceCard(item) {
                    navigator.push(ExperienceDetailScreen(item) {
                        navigator.pop()
                        onBack()
                    })
                }
            }
        }
    }
}


data class ExperienceDetailScreen(val experience: Experience, private val onBack: () -> Unit):Screen {
    @Composable
    override fun Content() {
       Scaffold(
            topBar = {
                TopAppBar(
                    backgroundColor =  MaterialTheme.colors.secondaryVariant,
                    title = { Text(text = "") },
                    navigationIcon = {
                        IconButton(onClick = { onBack() }) {
                            Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = Color.White
                            )
                        }
                    }
                )
            }
        ) { paddingValues ->
           val scrollState = rememberScrollState()
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(16.dp)
                    .verticalScroll(scrollState)
                    .fillMaxSize()
            ) {
                Image(
                    painter = experience.imagePainter,
                    contentDescription = null,
                    modifier = Modifier
                        .size(64.dp)
                        .padding(bottom = 16.dp)
                )
                Text(
                    text = experience.title,
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = experience.subTitle,
                    style = MaterialTheme.typography.subtitle1,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = experience.description,
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }
        }
    }

}
