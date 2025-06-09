package com.example.watch_selling_app.data.dataSource

import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductDetailsScreenData

object ProductDetailsScreenDataSource {

    fun getScreenData(): ProductDetailsScreenData {
        return ProductDetailsScreenData(
            checkoutDescriptionResId = R.string.checkout_btn_desc,
            titleDescriptionResId = R.string.Description,
            checkoutButtonResLightId = R.drawable.checkout_light,
            checkoutButtonDarkId = R.drawable.checkout_dark,
        )
    }

}