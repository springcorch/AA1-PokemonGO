package com.example.pokemongo.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

annotation class Pokemon(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    @StringRes val type: Int
)
