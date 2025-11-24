package com.example.pokemongo.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.pokemongo.R

annotation class Pokemon(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    @StringRes val type: Int
)

val pokemons = listOf(
    Pokemon(R.drawable.bulbasaur,R.string.pokemon_name_0, R.string.pokemon_type_0),
    Pokemon(R.drawable.charmander, R.string.pokemon_name_1, R.string.pokemon_type_1),
    Pokemon(R.drawable.squirtle, R.string.pokemon_name_2, R.string.pokemon_type_2),
    Pokemon(R.drawable.chikorita, R.string.pokemon_name_3, R.string.pokemon_type_0),
    Pokemon(R.drawable.cyndaquil, R.string.pokemon_name_4, R.string.pokemon_type_1),
    Pokemon(R.drawable.totodile, R.string.pokemon_name_5, R.string.pokemon_type_2),
    Pokemon(R.drawable.treecko, R.string.pokemon_name_6, R.string.pokemon_type_0),
    Pokemon(R.drawable.torchic, R.string.pokemon_name_7, R.string.pokemon_type_1),
    Pokemon(R.drawable.mudkip, R.string.pokemon_name_8, R.string.pokemon_type_2)
)