package com.example.pokemongo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.pokemongo.data.loadSections

@Composable
fun SectionComponent(modifier: Modifier, navController: NavController){
    val data = loadSections()
    LazyColumn {
        items(data.size) {
            Card(
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .clickable(enabled = true,
                        onClick = { navController.navigate("pokedexScreen")})
                    .padding(vertical = 4.dp)
            )
            {
                Column(
                    modifier
                        .background(color = MaterialTheme.colorScheme.secondary)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Spacer(modifier.padding(4.dp))
                    Text(
                        text = stringResource(data[it].name),
                        color = MaterialTheme.colorScheme.onSecondary,
                        fontSize = 24.sp
                    )
                    Image(
                        painter = painterResource(data[it].img),
                        contentDescription = "",
                        modifier = Modifier.width(325.dp).height(75.dp)
                            .clip(RoundedCornerShape(100)),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier.padding(4.dp))
                }
            }
        }
    }
}