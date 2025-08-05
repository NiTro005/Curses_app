package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val string: Int,
    val count: Int,
    @DrawableRes val image: Int
)