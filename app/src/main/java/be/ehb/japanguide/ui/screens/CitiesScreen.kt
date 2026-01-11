package be.ehb.japanguide.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import be.ehb.japanguide.data.LocalDataSource
import be.ehb.japanguide.ui.components.ImageCard
import be.ehb.japanguide.ui.theme.JapanRed

@Composable
fun CitiesScreen(
    modifier: Modifier = Modifier,
    onCityClick: (String) -> Unit,
    onBack: () -> Unit
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Text(text = "Cities", fontSize = 28.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
        }

        items(LocalDataSource.cities) { city ->
            ImageCard(
                title = city.name,
                subtitle = city.tagline,
                imageResId = city.imageResId,
                onClick = { onCityClick(city.id) },
                modifier = Modifier.fillMaxWidth()
            )
        }

        item {
            Spacer(modifier = Modifier.height(18.dp))
            Text(
                text = "Back",
                color = JapanRed,
                modifier = Modifier.clickable { onBack() }.padding(12.dp)
            )
        }
    }
}
