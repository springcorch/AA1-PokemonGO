package com.example.pokemongo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.pokemongo.R

//IAGO HAS MADE THIS SCREEN
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(modifier: Modifier, navController: NavController) {
    Column(
        modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Box(modifier = modifier.fillMaxWidth().padding(bottom = 34.dp),
            contentAlignment = Alignment.BottomCenter)
        {
            Image(
                painter = painterResource(id = R.drawable.signinscreenbackground),
                contentDescription = "",
                modifier = Modifier.alpha(0.75f)
                    .fillMaxWidth()
                    .padding(16.dp, 16.dp, 16.dp, 0.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .size(250.dp)

            )
            Text(
                text = "Sign In",
                color = MaterialTheme.colorScheme.onTertiary,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.displayLarge,
            )
        }
        Box(modifier = modifier.fillMaxWidth(),
            contentAlignment = Alignment.TopCenter)
        {
            val mailInputExample = "Enter your username"
            Text(
                text = "Username",
                color = MaterialTheme.colorScheme.onTertiary,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.bodyLarge,
            )

            OutlinedTextField(
                value = mailInputExample,
                onValueChange = {},
                modifier = modifier
                    .padding(16.dp).padding(top = 8.dp)
                    .border(1.dp, Color.White, RoundedCornerShape(8.dp)),
                shape = RoundedCornerShape(8.dp),
                singleLine = true,
            )
        }
        Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical = 8.dp))
        Box(modifier = modifier.fillMaxWidth(),
            contentAlignment = Alignment.TopCenter)
        {
            val mailInputExample = "Enter your mail"
            Text(
                text = "Mail",
                color = MaterialTheme.colorScheme.onTertiary,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.bodyLarge,
            )

            OutlinedTextField(
                value = mailInputExample,
                onValueChange = {},
                modifier = modifier
                    .padding(16.dp).padding(top = 8.dp)
                    .border(1.dp, Color.White, RoundedCornerShape(8.dp)),
                shape = RoundedCornerShape(8.dp),
                singleLine = true,
            )
        }
        Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical = 8.dp))
        Box(modifier = modifier.fillMaxWidth(),
            contentAlignment = Alignment.TopCenter)
        {
            Text(
                text = "Password",
                color = MaterialTheme.colorScheme.onTertiary,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.bodyLarge,
            )
            val passwordInputExample = "Enter your password"


            OutlinedTextField(
                value = passwordInputExample,
                onValueChange = {},
                modifier = modifier
                    .padding(16.dp).padding(top = 8.dp)
                    .border(1.dp, Color.White, RoundedCornerShape(8.dp)),
                shape = RoundedCornerShape(8.dp),
                singleLine = true
            )
        }
        Spacer(modifier = Modifier.padding(horizontal = 0.dp, vertical = 10.dp))
        Button(onClick = { navController.navigate("homeScreen") },
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary),
            modifier = modifier
                .size(width = 200.dp, height = 75.dp)) {
            Text(text = "SUBMIT",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        Button(onClick = { navController.navigate("loginScreen") }) {
            Text(
                text = "Already have an account? Log In!",
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}