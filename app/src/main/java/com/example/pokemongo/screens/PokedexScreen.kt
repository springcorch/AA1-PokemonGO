package com.example.pokemongo.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pokemongo.components.NavComponent
import com.example.pokemongo.components.SectionTitleComponent
import com.example.pokemongo.data.Pokemon
import com.example.pokemongo.data.pokemons

//IAGO & SAM HAS MADE THIS SCREEN
@Composable
fun PokedexScreen(modifier: Modifier, navController: NavController) {
    Column(Modifier.background(MaterialTheme.colorScheme.primary)){
        SectionTitleComponent(modifier, 2, navController)
        Spacer(Modifier.padding(8.dp))
        NavComponent(Modifier, navController)
        Spacer(Modifier.padding(8.dp))
        LazyColumn {
            items(pokemons.size) {
                PokemonItem(
                    pokemon = pokemons[it],
                    modifier = Modifier.padding(4.dp).padding(horizontal = 12.dp)
                )
            }
        }
    }
}

@Composable
fun PokemonItem(pokemon: Pokemon, modifier: Modifier = Modifier) {
    Card(modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.tertiary))
    {
        Row(modifier = Modifier.fillMaxWidth())
        {
            Box(modifier = Modifier
                .weight(1f)
                .background(MaterialTheme.colorScheme.secondary)
                .fillMaxHeight())
            {
                PokemonIcon(pokemon.image, modifier.padding(horizontal = 8.dp))
            }

            Box(modifier = Modifier
                .weight(1.5f)
                .fillMaxHeight())
            {
                PokemonInformation(pokemon.name, pokemon.type,
                    modifier.padding(horizontal = 8.dp))
            }

        }
    }
}

@Composable
fun PokemonIcon(@DrawableRes pokemonIcon: Int, modifier: Modifier = Modifier)
{
    Image(
        modifier = modifier.size(100.dp).fillMaxHeight(),
        contentScale = ContentScale.Crop,
        painter = painterResource(pokemonIcon),
        contentDescription = "",
    )
}

@Composable
fun PokemonInformation(@StringRes pokemonName: Int, pokemonType: Int, modifier: Modifier = Modifier)
{
    Column(modifier = modifier) {
        Text(
            text = stringResource(pokemonName),
            modifier = Modifier.padding(top = 16.dp),
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.onTertiary
        )
        Text(
            text = stringResource(pokemonType),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.onTertiary
        )
    }
}