package com.example.pokemongo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pokemongo.R
import com.example.pokemongo.components.NavComponent
import com.example.pokemongo.components.SectionComponent

//SAM HAS MADE THIS SCREEN
@Composable
fun HomeScreen(modifier: Modifier, navController: NavController) {
    Column(
        modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Spacer(modifier.padding(8.dp))
        NavComponent(modifier, navController)
        Spacer(modifier.padding(8.dp))
        Row(
            modifier
                .background(color = MaterialTheme.colorScheme.secondary)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically)
        {
            // Where every post will go - Row
            Column(modifier.clip(RoundedCornerShape(16.dp))) {
                Card(modifier.background(color = MaterialTheme.colorScheme.secondary)
                    .padding(vertical = 4.dp))
                {
                    Row(modifier.background(color = MaterialTheme.colorScheme.tertiary),
                        verticalAlignment = Alignment.CenterVertically) {
                        Spacer(modifier.padding(4.dp))
                        Image(painter = painterResource(id = R.drawable.user_icon_placeholder),
                            contentDescription = "",
                            modifier.size(36.dp)
                        )
                        Spacer(modifier.padding(4.dp))
                        Text(
                            text = "Trending header",
                            modifier.padding(16.dp),
                            color = MaterialTheme.colorScheme.onTertiary
                        )
                        Spacer(modifier.padding(4.dp))
                        Image(
                            painter = painterResource(id = R.drawable.image_placeholder),
                            contentDescription = "",
                            modifier.size(64.dp)
                        )
                    }
                }
                Card(modifier.background(color = MaterialTheme.colorScheme.secondary)
                    .padding(vertical = 4.dp))
                {
                    Row(modifier.background(color = MaterialTheme.colorScheme.tertiary),
                        verticalAlignment = Alignment.CenterVertically) {
                        Spacer(modifier.padding(4.dp))
                        Image(painter = painterResource(id = R.drawable.user_icon_placeholder),
                            contentDescription = "",
                            modifier.size(36.dp)
                        )
                        Spacer(modifier.padding(4.dp))
                        Text(
                            text = "Trending header",
                            modifier.padding(16.dp),
                            color = MaterialTheme.colorScheme.onTertiary
                        )
                        Spacer(modifier.padding(4.dp))
                        Image(
                            painter = painterResource(id = R.drawable.image_placeholder),
                            contentDescription = "",
                            modifier.size(64.dp)
                        )
                    }
                }
                Card(modifier.background(color = MaterialTheme.colorScheme.secondary)
                    .padding(vertical = 4.dp))
                {
                    Row(modifier.background(color = MaterialTheme.colorScheme.tertiary),
                        verticalAlignment = Alignment.CenterVertically) {
                        Spacer(modifier.padding(4.dp))
                        Image(painter = painterResource(id = R.drawable.user_icon_placeholder),
                            contentDescription = "",
                            modifier.size(36.dp)
                        )
                        Spacer(modifier.padding(4.dp))
                        Text(
                            text = "Trending header",
                            modifier.padding(16.dp),
                            color = MaterialTheme.colorScheme.onTertiary
                        )
                        Spacer(modifier.padding(4.dp))
                        Image(
                            painter = painterResource(id = R.drawable.image_placeholder),
                            contentDescription = "",
                            modifier.size(64.dp)
                        )
                    }
                }
            }
            Spacer(modifier.padding(8.dp))
            Box(modifier.width(20.dp)){
                Text(
                    text = "T  R  E  N  D  I  N  G",
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSecondary
                )
            }
        }
        Spacer(modifier.padding(8.dp))
        SectionComponent(modifier, navController)
        Spacer(modifier.padding(8.dp))
    }
}