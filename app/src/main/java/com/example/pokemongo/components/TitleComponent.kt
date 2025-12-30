package com.example.pokemongo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pokemongo.data.loadSections

@Composable
fun SectionTitleComponent(modifier: Modifier, sectionInt: Int, navController: NavController){
    val data = loadSections()
    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Image(
            painter = painterResource(data[sectionInt].img),
            contentDescription = "",
            modifier = Modifier.alpha(0.5f)
                .fillMaxWidth()
                .padding(16.dp).padding(bottom = 16.dp)
                .clip(RoundedCornerShape(40.dp))
                .size(180.dp)
        )
        Button(
            onClick = { navController.navigate("homeScreen") },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(8.dp)
                .size(48.dp),
            shape = CircleShape,
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary
            )
        ) {
            Text(
                text = "<",
                color = MaterialTheme.colorScheme.onTertiary,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.displaySmall
            )
        }
        Text(
            text = stringResource(data[sectionInt].name),
            color = MaterialTheme.colorScheme.onTertiary,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.displayLarge,
        )
    }
}