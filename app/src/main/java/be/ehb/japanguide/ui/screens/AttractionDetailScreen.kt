package be.ehb.japanguide.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import be.ehb.japanguide.ui.theme.JapanRed

@Composable
fun AttractionDetailScreen(
    attractionId: String,
    modifier: Modifier = Modifier,
    onBack: () -> Unit
) {
    val attraction = LocalDataSource.attractionById(attractionId) ?: return
    val titleShape = RoundedCornerShape(14.dp)
    val cardShape = RoundedCornerShape(18.dp)

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = attraction.name,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .clip(titleShape)
                .border(width = 1.dp, color = JapanRed, shape = titleShape)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = attraction.imageResId),
            contentDescription = attraction.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(cardShape)
                .border(width = 1.dp, color = JapanRed, shape = cardShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = attraction.description, fontSize = 16.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Back",
            color = JapanRed,
            modifier = Modifier.clickable { onBack() }.padding(12.dp)
        )
    }
}

