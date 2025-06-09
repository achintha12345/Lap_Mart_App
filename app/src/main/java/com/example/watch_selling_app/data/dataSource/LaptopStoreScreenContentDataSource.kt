package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.domain.model.WatchStoreScreenContent

object LaptopStoreScreenContentDataSource {

    fun getContent(): WatchStoreScreenContent {
        return WatchStoreScreenContent(
            titleKey = "watch_store_Title"
        )
    }
}