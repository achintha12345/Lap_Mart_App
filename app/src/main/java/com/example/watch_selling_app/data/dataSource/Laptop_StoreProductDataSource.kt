package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.ProductData

object Laptop_StoreProductDataSource {

    fun getStoreProducts(): List<ProductData> {
        return listOf(
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
                brandNameResId = R.string.msi,
                brandImageDesc = R.string.msi_laptop_description,
                modelNameResId = R.string.msi_vector_mdodel_name,
                price = 238904,
                imageResId = R.drawable.msi_vector_16_hx,
                isFavorite = false,
                id = 6,
                watchDesc = R.string.about_watch,
                rating = 4.5f
            )

        )

    }
}