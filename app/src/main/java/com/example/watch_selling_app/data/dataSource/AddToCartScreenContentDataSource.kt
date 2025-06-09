package com.example.watch_selling_app.data.dataSource

import androidx.annotation.DrawableRes
import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.AddToCartScreenContent

object AddToCartScreenContentDataSource {

    fun getContent(): AddToCartScreenContent {
        return AddToCartScreenContent(
            titleKey = "add_to_cart_title",
            subtitleKey = "my_picks",
            proceedButtonLightKey = R.drawable.buy_light,
            proceedButtonDarkKey = R.drawable.buy_dark,
        )
    }
}