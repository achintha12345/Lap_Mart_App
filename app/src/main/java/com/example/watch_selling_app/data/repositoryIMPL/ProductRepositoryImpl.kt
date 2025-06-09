package com.example.watch_selling_app.data.repositoryIMPL

import com.example.watch_selling_app.data.dataSource.GamingLaptopDataSource
import com.example.watch_selling_app.data.dataSource.NewLaptopsDataSource
import com.example.watch_selling_app.domain.model.ProductData
import com.example.watch_selling_app.domain.repository.ProductRepository
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor() : ProductRepository {
    override fun getProducts(): List<ProductData> {
        return NewLaptopsDataSource.getProducts()
    }

    override fun getCasualWatches(): List<ProductData> {
        return GamingLaptopDataSource.getCasualWatches()
    }
}



