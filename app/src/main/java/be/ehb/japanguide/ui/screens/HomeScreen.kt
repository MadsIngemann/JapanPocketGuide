package be.ehb.japanguide.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import be.ehb.japanguide.ui.components.CategoryCard
import be.ehb.japanguide.R
import be.ehb.japanguide.Routes
import be.ehb.japanguide.ui.theme.JapanRed

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onCategoryClick: (Routes) -> Unit
) {
    val titleShape = RoundedCornerShape(14.dp)
    val cardShape = RoundedCornerShape(18.dp)

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Japan PocketGuide",
            fontSize = 28.sp,
            modifier = Modifier
                .clip(titleShape)
                .border(width = 1.dp, color = JapanRed, shape = titleShape)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Image(
            painter = painterResource(id = R.drawable.fuji),
            contentDescription = "JapanGuide cover",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(cardShape)
                .border(width = 1.dp, color = JapanRed, shape = cardShape)
        )

        Spacer(modifier = Modifier.height(22.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(titleShape)
                .border(width = 1.dp, color = JapanRed, shape = titleShape)
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            Text(
                text = "Welcome! ようこそ!",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "This pocket guide is here to help you pick the best experiences for your Japan itinerary. It is packed with personal recommendations - from can't-miss classics to smaller, more local spots you might not find in your standard guide. Enjoy your trip!",
                fontSize = 14.sp
            )
        }

        Spacer(modifier = Modifier.height(22.dp))

        CategoryCard(
            title = "Cities",
            onItemClick = { onCategoryClick(Routes.Cities) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(14.dp))

        CategoryCard(
            title = "Food",
            onItemClick = { onCategoryClick(Routes.Food) },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(14.dp))

        CategoryCard(
            title = "Useful Phrases",
            onItemClick = { onCategoryClick(Routes.Phrases) },
            modifier = Modifier.fillMaxWidth()
        )
    }
}
