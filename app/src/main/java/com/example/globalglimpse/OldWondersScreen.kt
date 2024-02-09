package com.example.globalglimpse

import android.annotation.SuppressLint
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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

data class LandMarks(
    val photoId: Int,
    val photoName: String,
    val photoDescription: String
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OldWondersScreen(modifier: Modifier , onBackClicked: () -> Unit) {

    val landMarks = listOf(
        LandMarks(R.drawable.pyramid, "Great Pyramid Of Giza",
            "Great Pyramid Of Giza,The Great Pyramid of Giza, often referred to as the Pyramid of Khufu or the Pyramid of Cheops, stands as a testament to the ingenuity, skill, and ambition of the ancient Egyptians. Constructed during the Fourth Dynasty of the Old Kingdom, around 2560 BC, this monumental structure was commissioned as a tomb for Pharaoh Khufu, the second ruler of the Fourth Dynasty.\n" +
            "\n"+
                "Built on the Giza Plateau near Cairo, Egypt, the Great Pyramid is the largest of the three pyramids in the Giza pyramid complex. Originally towering at a height of approximately 146.6 meters (481 feet), it held the distinction of being the tallest man-made structure in the world for over 3,800 years until the construction of the Lincoln Cathedral in England in the 14th century AD.\n"+
                    "\n"+
                    "The pyramid's core is composed of millions of limestone blocks, each weighing several tons, quarried and transported from nearby sites. These blocks were precisely cut and fitted together to form the smooth, sloping sides of the pyramid, a remarkable feat of ancient engineering. Originally, the exterior was encased in polished Tura limestone casing stones, creating a smooth, gleaming surface that reflected the sun's rays.\n"+
                    "\n"+
                "The interior of the Great Pyramid contains a complex network of chambers and passageways, including the King's Chamber, the Queen's Chamber, and the Grand Gallery. The King's Chamber, located at the heart of the pyramid, houses an empty granite sarcophagus, believed to have been the final resting place of Pharaoh Khufu.\n"+
                    "\n"+
                   "The construction and design of the Great Pyramid are shrouded in mystery and have inspired countless theories and speculations over the centuries. Scholars continue to study its architecture, astronomical alignments, and symbolic significance, seeking to unravel the secrets of this ancient wonder.\n"+
                    "\n"+
                "Despite centuries of plundering, erosion, and seismic activity, the Great Pyramid remains largely intact, a testament to the durability and enduring legacy of ancient Egyptian civilization. It is a UNESCO World Heritage Site and one of the most visited tourist attractions in Egypt, drawing millions of visitors each year who come to marvel at its grandeur, ponder its mysteries, and contemplate its place in human history"
        ),
        LandMarks(R.drawable.lighthouse, "Lighthouse of Alexandria",
            "The Lighthouse of Alexandria, also known as the Pharos of Alexandria, was one of the most renowned architectural marvels of the ancient world. Built on the island of Pharos in the harbor of Alexandria, Egypt, during the reign of Ptolemy II Philadelphus in the 3rd century BC, this towering structure stood as a beacon of light and a symbol of innovation and progress.\n"+
                      "\n"+
                    "Standing at an estimated height of over 100 meters (330 feet), the Lighthouse of Alexandria was among the tallest man-made structures of its time, surpassed only by the Great Pyramid of Giza. Constructed primarily of white marble blocks, it featured three tiers: a square lower section, an octagonal middle section, and a cylindrical upper section crowned with a statue, possibly representing either Zeus or Poseidon.\n"+
                      "\n"+
                    "The lighthouse's main function was to guide sailors safely into the bustling port of Alexandria, one of the busiest and most important trade hubs of the ancient Mediterranean world. Its powerful beacon emitted light from an open fire fueled by wood or oil, which was reflected and amplified by a system of mirrors or lenses to create a visible signal visible from miles away.\n"+
                      "\n"+
                    "In addition to its practical navigational role, the Lighthouse of Alexandria also served as a symbol of the Ptolemaic dynasty's wealth, power, and cultural sophistication. It was adorned with intricate carvings, sculptures, and decorative elements, showcasing the artistic and architectural achievements of the Hellenistic period.\n"+
                      "\n"+
                    "Despite its prominence and historical significance, the Lighthouse of Alexandria was eventually destroyed by a series of earthquakes in the 14th century AD, leading to its gradual decline and eventual disappearance. Today, only archaeological remnants and historical accounts remain as testaments to its once-glorious existence, yet its legacy continues to inspire fascination and admiration for the ingenuity and ambition of ancient civilizations."
            ),
        LandMarks(R.drawable.masolues, "Mausoleum of Mausolus ",
            "The Mausoleum of Mausolus at Halicarnassus, often simply referred to as the Mausoleum of Mausolus, was a monumental tomb built in the ancient city of Halicarnassus (modern-day Bodrum, Turkey) during the 4th century BC. Commissioned by Artemisia II of Caria in honor of her husband and brother, Mausolus, the satrap (governor) of Caria, it was constructed by renowned architects and sculptors of the time.\n"+
                    "\n"+
            "The mausoleum was designed to be a grandiose and imposing structure, reflecting the wealth, power, and artistic patronage of the Carian dynasty. It stood as one of the Seven Wonders of the Ancient World, admired for its architectural beauty, intricate sculptures, and historical significance.\n"+
                    "\n"+
            "The Mausoleum of Mausolus was constructed atop a large stone platform and featured a square base surrounded by a series of colonnades adorned with elaborate carvings and reliefs depicting mythological scenes, battles, and triumphs. Rising above the base was a stepped pyramid-like structure consisting of multiple tiers or levels, each adorned with sculptural friezes, statues, and decorative elements.\n"+
                    "\n"+
            "At the pinnacle of the mausoleum stood a magnificent marble chariot drawn by four horses, serving as a crowning monument to Mausolus and Artemisia's legacy. The interior of the mausoleum housed the burial chamber, containing the sarcophagus of Mausolus and Artemisia, as well as various treasures and artifacts.\n"+
                    "\n"+
            "The Mausoleum of Mausolus was not only a burial site but also a symbol of civic pride and cultural identity for the city of Halicarnassus. It attracted visitors and admirers from far and wide, serving as a testament to the achievements of the ancient Carian civilization and the enduring legacy of Mausolus and Artemisia.\n"+
                    "\n"+
            "Despite its grandeur and historical significance, the Mausoleum of Mausolus was damaged and eventually destroyed by a series of earthquakes and wars over the centuries. Today, only fragments and ruins remain at the original site in Bodrum, Turkey, yet its memory continues to captivate the imagination of historians, archaeologists, and enthusiasts of ancient history and architecture."
            ),

        LandMarks(R.drawable.artemis, "Temple of Artemis in Ephesus",
            "The Temple of Artemis, also known as the Artemision, was a grandiose ancient Greek temple dedicated to the goddess Artemis, located in the city of Ephesus (modern-day Selçuk, Turkey). Built during the 6th century BCE, it was one of the Seven Wonders of the Ancient World, renowned for its immense size, stunning architecture, and rich artistic embellishments.\n"+
                    "\n"+
            "The temple was commissioned by the Lydian king Croesus and designed by the Greek architect Chersiphron, with contributions from his son Metagenes. It was constructed on a grand scale, featuring a peripteral octastyle design with Ionic columns, measuring approximately 129 meters (425 feet) in length and 68 meters (223 feet) in width.\n"+
                    "\n"+
            "The exterior of the Temple of Artemis was adorned with intricate carvings, reliefs, and sculptures depicting mythological scenes, divine figures, and symbolic motifs associated with Artemis, such as hunting scenes, animals, and floral patterns. The temple's façade was adorned with impressive statuary and friezes, showcasing the skill and craftsmanship of ancient Greek sculptors and artisans.\n"+
                    "\n"+
            "The interior of the temple housed a grand cult statue of Artemis, crafted from gold and ivory, and served as a focal point for religious rituals, ceremonies, and offerings dedicated to the goddess of hunting, wilderness, and fertility. Surrounding the temple were sacred precincts, courtyards, and altars, where pilgrims and worshippers gathered to pay homage to Artemis and seek her blessings.\n"+
                    "\n"+
            "The Temple of Artemis was not only a center of religious worship but also a symbol of prosperity, cultural achievement, and civic pride for the city of Ephesus and the wider region of Ionia. It attracted visitors, traders, and devotees from across the Mediterranean world, contributing to the city's fame and fortune as a thriving commercial and cultural hub.\n"+
                    "\n"+
            "Despite its significance and grandeur, the Temple of Artemis was subjected to several instances of destruction and reconstruction over the centuries, including damage by fire, invasion, and natural disasters. The final destruction of the temple occurred during the 4th century CE, when it was razed to the ground by the Goths.\n"+
                    "\n"+
            "Today, only ruins and scattered fragments remain at the original site of the Temple of Artemis in Ephesus, yet its memory lives on as a symbol of ancient Greek architecture, religious devotion, and cultural heritage, inspiring awe and fascination among visitors and historians alike."
        ),

        LandMarks(R.drawable.babyel, "Hanging Gardens of Babylon",
            "The Hanging Gardens of Babylon are one of the Seven Wonders of the Ancient World, and they were considered a marvel of engineering and horticulture in ancient times. Here's a description of the Hanging Gardens of Babylon:\n" +
                    "\n" +
            "The Hanging Gardens of Babylon were an extraordinary feat of architecture and landscape design located in the ancient city of Babylon, near present-day Hillah, Babil province, in Iraq. Built around 600 BCE, during the reign of King Nebuchadnezzar II, these gardens were renowned for their lush greenery, vibrant flora, and innovative irrigation system.\n" +
                    "\n" +
            "The gardens were designed as a series of terraced platforms, rising in tiers like a giant green mountain. These terraces were supported by a complex system of stone columns, which created a series of elevated gardens that seemed to hang in the air, hence the name \"Hanging Gardens.\" The terraces were constructed using a combination of mud bricks and waterproof bitumen to prevent water leakage and erosion.\n" +
                    "\n" +
            "To water the gardens, engineers devised a sophisticated irrigation system that pumped water from the Euphrates River to the topmost terrace, from where it cascaded down through a series of channels and pipes, gradually watering each tier of the garden. This innovative hydraulic system allowed plants to flourish in an otherwise arid environment, creating a verdant oasis in the heart of the desert.\n" +
                    "\n" +
            "The gardens were adorned with a diverse array of plant species, including exotic trees, shrubs, flowers, and even fruit-bearing trees. It is said that the gardens were planted with a variety of flora from different regions of the Babylonian empire, as well as plants imported from distant lands, contributing to their botanical diversity and beauty.\n" +
                    "\n" +
            "The Hanging Gardens of Babylon were not only a marvel of engineering but also a symbol of luxury and opulence, intended to impress and awe visitors to the city. According to ancient accounts, the gardens were originally built by King Nebuchadnezzar II for his wife, Queen Amytis of Media, who longed for the green hills and forests of her homeland. Whether the gardens were a historical reality or a legendary creation remains a topic of debate among historians and archaeologists, as there is limited archaeological evidence to confirm their existence.\n" +
                    "\n" +
            "Despite their uncertain fate and mysterious origins, the Hanging Gardens of Babylon have captured the imagination of people for centuries and continue to be celebrated as one of the greatest wonders of the ancient world. Their legacy lives on in art, literature, and popular culture, inspiring awe and fascination with their legendary beauty and ingenuity."

            ),
        LandMarks(
            R.drawable.zeus,
            "The Statue of Zeus",
            "The Statue of Zeus at Olympia was a monumental chryselephantine statue depicting the king of the Greek gods, Zeus, situated within the Temple of Zeus in the sanctuary of Olympia, Greece. Created by the renowned sculptor Phidias around the mid-5th century BCE, it was considered one of the greatest masterpieces of ancient Greek art and one of the Seven Wonders of the Ancient World.\n"+
                    "\n"+
            "The statue stood approximately 12 meters (39 feet) tall and was crafted using a combination of gold, ivory, ebony, and other precious materials. Zeus was depicted seated on a magnificent throne, holding a scepter in one hand and a winged figure of Nike (Victory) in the other. His majestic figure was adorned with elaborate drapery, intricate details, and lifelike features, conveying a sense of divine power, majesty, and authority.\n"+
                    "\n"+
            "The Temple of Zeus, where the statue was housed, was constructed specifically to accommodate the colossal statue, serving as a grandiose shrine and focal point for religious rituals and ceremonies dedicated to Zeus, the chief deity of the Greek pantheon. The statue's presence within the temple symbolized Zeus's role as the supreme ruler of the gods and patron of the Olympic Games, which were held in Olympia every four years in his honor.\n"+
                    "\n"+
            "The Statue of Zeus at Olympia was not only a religious icon but also a symbol of Greek artistic and cultural achievement, attracting pilgrims, tourists, and dignitaries from all corners of the ancient world who came to marvel at its splendor and pay homage to the king of the gods. It served as a testament to the skill and ingenuity of Phidias and his workshop, who were celebrated as the finest sculptors of their time.\n"+
                    "\n"+
            "Despite its significance and acclaim, the fate of the Statue of Zeus was ultimately tied to the decline of the ancient world. Following the gradual decline of Olympia and the spread of Christianity, the statue was likely destroyed or damaged during the early centuries of the Christian era, along with many other pagan monuments and temples. Today, only descriptions and depictions of the statue survive, yet its legacy endures as a symbol of the artistic brilliance and cultural richness of ancient Greece."
        ) ,
        LandMarks(
            R.drawable.rhodes,
            "The Colossus of Rhodes",
            "The Colossus of Rhodes, also known as the Statue of Rhodes, was a gigantic bronze statue of the sun god Helios, erected on the Greek island of Rhodes around 280 BCE. It was one of the Seven Wonders of the Ancient World, renowned for its colossal size and impressive craftsmanship.\n"+

            "The statue stood at the entrance of the harbor of Rhodes, welcoming ships and visitors to the island. It was constructed to commemorate the successful defense of Rhodes against a siege by the Macedonian king Demetrius Poliorcetes in 305 BCE. The Rhodians decided to repurpose the siege engines left behind by the defeated army to build the statue as a tribute to their patron deity, Helios.\n"+
                    "\n"+
            "Designed by the sculptor Chares of Lindos, the Colossus of Rhodes was estimated to stand around 30 meters (approximately 98 feet) tall, making it one of the tallest statues of the ancient world. It depicted Helios, the personification of the sun, standing nude with a crown of sun rays on his head and a torch held aloft in his hand, symbolizing enlightenment and guidance.\n"+
                    "\n"+
            "The statue was constructed using a framework of iron bars and bronze plates, with the exterior surface sculpted in detail to resemble the god Helios. According to historical accounts, the construction of the Colossus took approximately 12 years to complete, and it was a marvel of ancient engineering and artistic skill.\n"+
                    "\n"+
            "For centuries, the Colossus of Rhodes stood as a symbol of the prosperity, power, and cultural achievements of the city-state of Rhodes. It attracted travelers and admirers from across the Mediterranean, who marveled at its grandeur and significance. However, the statue's existence was relatively short-lived.\n"+
                    "\n"+
            "In 226 BCE, just 54 years after its completion, a powerful earthquake struck Rhodes, causing significant damage to the statue. The Colossus reportedly collapsed at the knees and lay in ruins for centuries. Despite efforts to repair it, including proposals to rebuild the statue in its original form, the shattered remains of the Colossus were eventually sold as scrap metal by Arab conquerors in the 7th century CE.\n"+
                    "\n"+
            "Although the Colossus of Rhodes no longer stands, its legacy lives on in the annals of history and in the imagination of people around the world. It remains a symbol of human creativity, resilience, and the enduring quest for greatness."
        )
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Old Wonders " , fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = { onBackClicked() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        }
    ) {

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
                Photo(image = painterResource(id = currentLandmark.photoId))

                Text(
                    text = currentLandmark.photoName,
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(top = 15.dp, bottom = 5.dp)
                )
            }

            Surface(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) {
                        showFullDescription = !showFullDescription
                    },
                shape = MaterialTheme.shapes.large,
                border = ButtonDefaults.outlinedButtonBorder,
                color = Color.Transparent
            ) {
                Text(
                    text = if (showFullDescription) currentLandmark.photoDescription else currentLandmark.photoDescription.take(
                        200
                    ),
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
}

@Composable
fun Photo(image: Painter) {
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.size(height = 325.dp , width = 500.dp)
            .padding(top = 60.dp),
        alignment = Alignment.TopCenter
    )
}