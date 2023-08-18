package com.ddk.wineapp.model

import androidx.annotation.DrawableRes

data class RecipeImage(
    @DrawableRes
    val recipeImageResourceId: Int,
    val content: String
)