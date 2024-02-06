package com.example.globalglimpse

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

data class LandMark(
    val photoId: Int,
    val photoName: String,
    val photoDescription: String
)

@Composable
fun InformationScreen() {
    val landMarks = listOf(
        LandMark(
            R.drawable.china,
            "Great Wall of China",
            "The Great Wall of China is an iconic symbol of Chinese civilization and one of the most famous landmarks in the world. It is a series of fortifications built along the northern borders of China to protect against invasions and raids from various nomadic groups and military incursions over centuries of Chinese history. Construction of the wall began as early as the 7th century BC and continued for several centuries, with various dynasties contributing to its expansion and reinforcement.\n" +
                    "\n" +
                    "The Great Wall stretches over 13,000 miles (21,196 kilometers), making it one of the most impressive architectural feats in history. It consists of various walls, watchtowers, and defensive structures built using a variety of materials, including stone, brick, tamped earth, and wood.\n" +
                    "\n" +
                    "Besides its defensive function, the Great Wall also served as a means of controlling immigration and emigration, regulating trade, and facilitating transportation and communication along the ancient Silk Road. In addition to its military and strategic significance, the Great Wall has become a symbol of Chinese national pride and cultural identity, attracting millions of visitors from around the world each year."
            ),

        LandMark(
            R.drawable.chichen,
            "Chichen Itza",
            "Chichen Itza is a famous archaeological site located in the Yucatán Peninsula of Mexico, known for its well-preserved Mayan ruins and historical significance. It was once a major city in the Mayan civilization, flourishing between the 7th and 10th centuries AD.\n" +
                    "\n" +
                    "The site is renowned for its iconic pyramid known as El Castillo or the Temple of Kukulcan, which stands as a testament to Mayan architectural and astronomical prowess. This pyramid is a masterpiece of ancient engineering, designed with precise alignment to astronomical events such as the equinoxes, resulting in spectacular light and shadow effects on the pyramid's staircases during these times.\n" +
                    "\n" +
                    "Chichen Itza was not only a religious and ceremonial center but also served as a hub for trade, culture, and politics in the region. It contains various structures, including temples, ball courts, observatories, and sacred cenotes (natural sinkholes), providing insights into Mayan beliefs, rituals, and daily life.\n" +
                    "\n" +
                    "In 1988, Chichen Itza was designated as a UNESCO World Heritage Site, recognizing its outstanding universal value and cultural significance. Today, it remains one of the most visited archaeological sites in Mexico, attracting tourists, archaeologists, and history enthusiasts from around the world who come to marvel at its architectural wonders and unravel the mysteries of the ancient Mayan civilization"
            ),
        LandMark(
            R.drawable.colosseum,
            "Colosseum",
            "The Colosseum, also known as the Flavian Amphitheatre, is an ancient amphitheater located in the center of Rome, Italy. It is one of the most iconic and well-preserved landmarks of ancient Rome. Built during the reign of the Flavian emperors in the first century AD, it was primarily used for gladiatorial contests and public spectacles such as animal hunts, executions, re-enactments of famous battles, and drama performances.\n" +
                    "\n" +
                    "The Colosseum is an architectural marvel, with its elliptical shape and grand scale. It could accommodate up to 50,000 spectators, who would gather to witness the thrilling and often violent events held within its walls. The amphitheater features multiple levels of seating, with different sections reserved for different social classes.\n" +
                    "\n" +
                    "Despite its age and the damage inflicted by earthquakes and stone-robbers over the centuries, the Colosseum remains an enduring symbol of ancient Rome's power, ingenuity, and cultural legacy. Today, it stands as a testament to the remarkable engineering and architectural skills of the Roman Empire and attracts millions of visitors from around the world who come to marvel at its grandeur and learn about its rich history."
            ),
        LandMark(
            R.drawable.misho,
            "Machu Picchu",
            "Machu Picchu is an ancient Incan citadel located in the Andes Mountains of Peru. It was built in the 15th century during the reign of the Inca emperor Pachacuti. Situated atop a ridge overlooking the Urubamba River valley, Machu Picchu is renowned for its breathtaking mountainous setting, intricate stone constructions, and mysterious aura.\n" +
                    "\n" +
                    "The citadel served as a royal estate or sacred religious site for the Inca civilization, though its exact purpose remains a subject of debate among archaeologists. It is believed to have been abandoned around the time of the Spanish conquest in the 16th century, but its remote location helped preserve it from widespread destruction.\n" +
                    "\n" +
                    "Machu Picchu's architectural marvels include stone terraces, temples, palaces, and residential buildings, all intricately constructed without mortar. The site is also renowned for its sophisticated agricultural terraces, water management systems, and astronomical observatories, indicating the advanced engineering and astronomical knowledge of the Inca people.\n" +
                    "\n" +
                    "Rediscovered by American explorer Hiram Bingham in 1911, Machu Picchu has since become one of the world's most iconic archaeological sites and a UNESCO World Heritage Site. It attracts millions of visitors each year who come to marvel at its beauty, explore its ancient mysteries, and appreciate its cultural significance."
            ),
        LandMark(
            R.drawable.patra,
            "Petra",
            "Petra is an ancient city located in present-day Jordan, renowned for its remarkable rock-cut architecture and historical significance. Established by the Nabateans, an ancient Arab civilization, around the 6th century BCE, Petra flourished as a major trading hub and capital city until it was abandoned in the 7th century CE.\n" +
                    "\n" +
                    "The city's most iconic structure is the Treasury (Al-Khazneh), a magnificent temple carved into the sandstone cliffs. Other notable features include the Monastery (Ad Deir), the Royal Tombs, and the Roman-style amphitheater. Petra's unique architecture and intricate carvings reflect a blend of Nabatean, Greco-Roman, and Arabian influences.\n" +
                    "\n" +
                    "In ancient times, Petra served as a crucial junction for trade routes linking Arabia, Egypt, and Syria. Its strategic location and wealth from trade made it a prosperous city, known as the \"Rose City\" due to the pinkish hue of its rock-cut buildings.\n" +
                    "\n" +
                    "Abandoned and forgotten for centuries, Petra was rediscovered by Swiss explorer Johann Ludwig Burckhardt in the early 19th century, sparking renewed interest in its archaeological significance. Today, Petra is a UNESCO World Heritage Site and one of the most visited tourist destinations in the Middle East, attracting travelers from around the world to marvel at its awe-inspiring architecture and rich history."
            ),
        LandMark(
            R.drawable.taj,
            "Taj Mahal",
            "The Taj Mahal is a majestic white marble mausoleum located in Agra, India, and is considered one of the most beautiful buildings in the world. It was commissioned in the 17th century by the Mughal emperor Shah Jahan in memory of his beloved wife, Mumtaz Mahal, who died during childbirth.\n" +
                    "\n" +
                    "Designed by a team of architects and artisans from across the Mughal Empire and beyond, the Taj Mahal is renowned for its symmetrical beauty and intricate craftsmanship. Its central dome, flanked by four minarets, rises gracefully above the surrounding landscape and reflects in the tranquil waters of the ornamental pool at its base.\n" +
                    "\n" +
                    "The mausoleum's white marble facade is adorned with delicate floral and geometric patterns, inlaid with semi-precious stones such as jade, lapis lazuli, and turquoise. Inside, the main chamber houses the tombs of Shah Jahan and Mumtaz Mahal, intricately carved with Quranic inscriptions and surrounded by finely crafted marble screens.\n" +
                    "\n" +
                    "The Taj Mahal's architectural elegance and poignant love story have made it a symbol of enduring love and an iconic emblem of India's rich cultural heritage. It is a UNESCO World Heritage Site and attracts millions of visitors from around the world who come to admire its beauty and pay homage to the eternal love it represents."
            ),
        LandMark(
            R.drawable.cris,
            "Statue of Christ the Redeemer",
            "The Statue of Christ the Redeemer is an iconic monument located atop the Corcovado mountain in Rio de Janeiro, Brazil. Standing at a towering height of approximately 30 meters (98 feet), it depicts Jesus Christ with outstretched arms, symbolizing his role as the savior of humanity.\n" +
                    "\n" +
                    "Constructed between 1922 and 1931, the statue was designed by Brazilian engineer Heitor da Silva Costa and sculpted by French artist Paul Landowski. It is made of reinforced concrete and soapstone, and its construction was funded by donations from Brazilian Catholics.\n" +
                    "\n" +
                    "The Statue of Christ the Redeemer overlooks the vibrant city of Rio de Janeiro, offering panoramic views of its stunning landscape, including the famous Copacabana and Ipanema beaches, Sugarloaf Mountain, and Guanabara Bay. It has become one of Brazil's most recognized landmarks and a symbol of Rio's cultural and religious identity.\n" +
                    "\n" +
                    "A symbol of peace, love, and faith, the statue attracts millions of visitors from around the world each year, who come to marvel at its grandeur, soak in the breathtaking views, and experience the spiritual significance it holds for many Brazilians and Christians worldwide. In 2007, it was designated as one of the New Seven Wonders of the World, further solidifying its status as a global icon."
            )
    )

    var currentIndex by remember {
        mutableStateOf(0)
    }
    var showFullDescription by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val currentLandmark = landMarks[currentIndex]

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            LandmarkPhoto(image = painterResource(id = currentLandmark.photoId))

            Text(
                text = currentLandmark.photoName,
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(top= 15.dp , bottom = 5.dp)
            )
        }

        Surface(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() }, // Provide an interaction source
                    indication = null
                ) {
                    showFullDescription = !showFullDescription
                },
            shape = MaterialTheme.shapes.large,
            border = ButtonDefaults.outlinedButtonBorder,
            color = Color.Transparent
        ) {
            Text(
                text = if (showFullDescription) currentLandmark.photoDescription else currentLandmark.photoDescription.take(200),
                modifier = Modifier.padding(16.dp)
            )
        }

        Button(
            onClick = { showFullDescription = !showFullDescription },
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Text(text = if (showFullDescription) "Show Less" else "Show More")
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom,
            content = {
                Button(
                    onClick = {
                        currentIndex = (currentIndex - 1 + landMarks.size) % landMarks.size
                        showFullDescription = false
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 20.dp, end = 10.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = "Previous",
                            modifier = Modifier.padding(end = 5.dp)
                        )
                        Text(text = "Previous")
                    }
                }
                Button(
                    onClick = {
                        currentIndex = (currentIndex + 1) % landMarks.size
                        showFullDescription = false
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 10.dp, end = 20.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Next")
                        Icon(
                            Icons.Default.ArrowForward,
                            contentDescription = "Next",
                            modifier = Modifier.padding(start = 5.dp)
                        )
                    }
                }
            }
        )
    }
}

@Composable
fun LandmarkPhoto(image: Painter) {
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.size(height = 260.dp , width = 400.dp),
        alignment = Alignment.TopCenter
    )
}
