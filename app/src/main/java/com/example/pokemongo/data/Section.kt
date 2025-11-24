package com.example.pokemongo.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.pokemongo.R

annotation class Section(
    @DrawableRes val img: Int,
    @StringRes val name: Int
)

fun loadSections(): List<Section> {
    return listOf<Section>(
        return listOf(
            Section(R.drawable.section1image, R.string.section1),
            Section(R.drawable.section2image, R.string.section2),
            Section(R.drawable.section3image, R.string.section3),
            Section(R.drawable.section4image, R.string.section4),
        )
    )
}
