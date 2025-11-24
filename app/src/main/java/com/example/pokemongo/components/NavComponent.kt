package com.example.pokemongo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pokemongo.data.loadSections

@Composable
fun NavComponent(modifier: Modifier, navController: NavController){
    val data = loadSections()
    LazyRow {
        items(data.size) {
            Row(
                modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondary)
                    .padding(8.dp))
            {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier.background(MaterialTheme.colorScheme.tertiary)
                        .fillMaxWidth().clickable(enabled = true,
                            onClick = {navController.navigate("pokedexScreen")}),
                        horizontalAlignment = Alignment.CenterHorizontally)
                    {
                        Image(
                            painter = painterResource(data[it].img),
                            contentDescription = "",
                            modifier = Modifier.width(100.dp).height(25.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = stringResource(data[it].name),
                            color = MaterialTheme.colorScheme.onTertiary
                        )
                    }
                }
            }
        }
    }
}