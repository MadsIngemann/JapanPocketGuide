package be.ehb.japanguide.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import be.ehb.japanguide.data.LocalDataSource
import be.ehb.japanguide.ui.components.ImageCard
import be.ehb.japanguide.ui.theme.JapanRed

@Composable
fun CityDetailScreen(
    cityId: String,
    modifier: Modifier = Modifier,
    onAttractionClick: (String) -> Unit,
    onBack: () -> Unit
) {
    val city = LocalDataSource.cityById(cityId) ?: return
    val titleShape = RoundedCornerShape(14.dp)
    val cardShape = RoundedCornerShape(18.dp)

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(
                text = city.name,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clip(titleShape)
                    .border(width = 1.dp, color = JapanRed, shape = titleShape)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }

        item {
            Image(
                painter = painterResource(id = city.imageResId),
                contentDescription = city.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .clip(cardShape)
                    .border(width = 1.dp, color = JapanRed, shape = cardShape)
            )
        }

        item {
            Text(text = city.intro, fontSize = 16.sp)
        }

        item {
            Text(
                text = "Recommendations",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.fillMaxWidth()
            )
        }

        items(city.topAttractionIds) { attractionId ->
            val attraction = LocalDataSource.attractionById(attractionId) ?: return@items
            ImageCard(
                title = attraction.name,
                imageResId = attraction.imageResId,
                onClick = { onAttractionClick(attraction.id) },
                modifier = Modifier.fillMaxWidth()
            )
        }

        item {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Back",
                color = JapanRed,
                modifier = Modifier.clickable { onBack() }.padding(12.dp)
            )
        }
    }
}
