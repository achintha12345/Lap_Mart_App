package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductData

object GamingLaptopDataSource {
    fun getCasualWatches(): List<ProductData> {
        return listOf(
            ProductData(
                brandNameResId = R.string.msi,
                brandImageDesc = R.string.msi_laptop_description,
                modelNameResId = R.string.msi_gaming_mdodel_name,
                price = 120000,
                imageResId = R.drawable.msi_cyborg_gaming_15_ai_ultra_7,
                isFavorite = false,
                id = 1,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_lenovo,
                brandImageDesc = R.string.lenov_lap_description,
                modelNameResId = R.string.lenovo_gaming_mdodel_name,
                price = 120000,
                imageResId = R.drawable.lenovo_ideapad_slim_5_16imh9_ultra,
                isFavorite = false,
                id = 2,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_asus_tuf,
                brandImageDesc = R.string.asus_lap_description,
                modelNameResId = R.string.asus_gaming_model_name,
                price  = 220000,
                imageResId = R.drawable.asus_tuf_a15_gaming,
                isFavorite = false,
                id = 3,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_hp,
                brandImageDesc = R.string.hp_lap_description,
                modelNameResId = R.string.hp_gaming_mdodel_name,
                price = 320000,
                imageResId = R.drawable.hp_victus_fb2132ax_gaming_ryzen_7,
                isFavorite = false,
                id = 4,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_asus_rog,
                brandImageDesc = R.string.asus_lap_description,
                modelNameResId = R.string.rog_asus_mdodel_name,
                price = 420000,
                imageResId = R.drawable.asus_zenbook_laptop,
                isFavorite = false,
                id = 5,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.msi,
                brandImageDesc = R.string.msi_laptop_description,
                modelNameResId = R.string.msi_vector_mdodel_name,
                price = 238904,
                imageResId = R.drawable.msi_vector_16_hx,
                isFavorite = false,
                id = 6,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
        )
    }
}