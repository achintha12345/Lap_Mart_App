package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.BrandData

object BrandDataSource {

    fun getBrands(): List<BrandData> = listOf(
        BrandData(
            nameResId = R.string.brand_rolex,
            logoDescriptionResId = R.string.brand_rolex_description,
            logoResId = R.drawable.msi_logo,
            id = 1,

        ),
        BrandData(
            nameResId = R.string.hp_logo,
            logoDescriptionResId = R.string.brand_hp_description,
            logoResId = R.drawable.hp_icon,
            id = 2
        ),
        BrandData(
            nameResId = R.string.lenovo_logo,
            logoDescriptionResId = R.string.brand_lenevo_description,
            logoResId = R.drawable.lenovo_logo,
            id = 3
        ),
        BrandData(
            nameResId = R.string.assus_logo,
            logoDescriptionResId = R.string.brand_assus_description,
            logoResId = R.drawable.asus_logoo,
            id = 4
        )

    )
}