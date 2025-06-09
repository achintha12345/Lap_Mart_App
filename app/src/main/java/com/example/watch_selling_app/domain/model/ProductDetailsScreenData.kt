package com.example.watch_selling_app.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ProductDetailsScreenData(
    @DrawableRes  val checkoutButtonResLightId: Int,
    @DrawableRes val checkoutButtonDarkId : Int,
    @StringRes val checkoutDescriptionResId: Int,
    @StringRes val titleDescriptionResId: Int,
)
