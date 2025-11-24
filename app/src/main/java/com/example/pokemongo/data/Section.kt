package com.example.pokemongo.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

annotation class Section(
    @DrawableRes val img: Int,
    @StringRes val name: Int
)
