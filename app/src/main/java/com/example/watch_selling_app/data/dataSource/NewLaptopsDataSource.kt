package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductData

object NewLaptopsDataSource {
    fun getProducts(): List<ProductData> {
        return listOf(
            ProductData(
                brandNameResId = R.string.msi,
                brandImageDesc = R.string.msi_laptop_description,
                modelNameResId = R.string.msi_mdodel_name,
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
                modelNameResId = R.string.lenovo_mdodel_name,
                price = 120000,
                imageResId = R.drawable.lenovo_idepad_slim,
                isFavorite = false,
                id = 2,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_asus_tuf,
                brandImageDesc = R.string.asus_lap_description,
                modelNameResId = R.string.asus_model_name,
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
                modelNameResId = R.string.hp_mdodel_name,
                price = 320000,
                imageResId = R.drawable.hp_probook_i7,
                isFavorite = false,
                id = 4,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.brand_asus_rog,
                brandImageDesc = R.string.asus_lap_description,
                modelNameResId = R.string.rog_mdodel_name,
                price = 420000,
                imageResId = R.drawable.asus_rog_strix_gaming_i7,
                isFavorite = false,
                id = 5,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),
            ProductData(
                brandNameResId = R.string.msi,
                brandImageDesc = R.string.msi_laptop_description,
                modelNameResId = R.string.msi_modern_mdodel_name,
                price = 238904,
                imageResId = R.drawable.msi_modern_15_b12m_i5,
                isFavorite = false,
                id = 6,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            ),

        )
    }


}