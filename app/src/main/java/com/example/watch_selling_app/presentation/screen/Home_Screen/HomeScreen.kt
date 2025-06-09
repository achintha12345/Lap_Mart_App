package com.example.watch_selling_app.presentation.screen.Home_Screen

import androidx.compose.foundation.Image
import com.example.watch_selling_app.R
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.data.dataSource.*
import com.example.watch_selling_app.domain.model.BottomNavItem
import com.example.watch_selling_app.domain.model.BrandData
import com.example.watch_selling_app.domain.model.ProductData
import com.example.watch_selling_app.presentation.components.BottomNavigationBar
import com.example.watch_selling_app.presentation.components.brand.BrandListSection
import com.example.watch_selling_app.presentation.components.product.CasualWatchSection
import com.example.watch_selling_app.presentation.components.product.ProductListSection
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.utils.FavoritesManager

@Composable
fun HomeScreen(
    onProductClick: (ProductData) -> Unit,
    navItems: List<BottomNavItem>,
    selectedItem: BottomNavItem,
    onNavigateTo: (String) -> Unit
) {
    val topBarContent = DataSource.getTopBarContent()
    val searchBarContent = DataSource.getSearchBarContent()
    val carouselPartContent = CarouselDataSource.getCarouselItems()
    val products = NewLaptopsDataSource.getProducts()
    val casualWatches = GamingLaptopDataSource.getCasualWatches()
    val brands = BrandDataSource.getBrands()


    var selectedBrand by remember { mutableStateOf<BrandData?>(null) }

    var refreshTrigger by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Dimens.SpacingXXL)
            ) {
                // Top Row: Menu icon + Profile image
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Icon(
                        imageVector = Icons.Default.List,
                        contentDescription = null,
                        modifier = Modifier.size(Dimens.buttonsHeight)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.profile_home_scrn),
                        contentDescription = null,
                        modifier = Modifier
                            .size(Dimens.profile_image_size)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                }

                // Spacer between Row and Search Bar
                Spacer(modifier = Modifier.height(Dimens.SpacingM))

                // Search Bar
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text(text = stringResource(id = R.string.home_screen_searchbar)) },
                    singleLine = true,
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = null
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = MaterialTheme.colorScheme.onBackground
                    ),
                    modifier = Modifier
                        .fillMaxWidth()


                )
            }
        },

        contentWindowInsets = WindowInsets(0, 0, 0, 0),
        bottomBar = {
            BottomNavigationBar(
                items = navItems,
                selectedItem = selectedItem,
                onItemSelected = { item ->
                    onNavigateTo(item.route)
                }
            )
        }
    ) { paddingValues ->
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(scrollState)
        ) {


            BrandListSection(
                brands = brands,
                selectedBrand = selectedBrand,
                onBrandSelected = { brand ->
                    selectedBrand = brand
                },
                modifier = Modifier.padding(top = Dimens.SpacingM)
            )
            ProductListSection(
                products = products,
                onProductClick = { product ->
                    onProductClick(product)
                },
                onFavoriteClick = { product ->
                    FavoritesManager.toggleFavorite(product)
                    refreshTrigger++
                },
                refreshTrigger = refreshTrigger
            )

            CasualWatchSection(
                products = casualWatches,
                onProductClick = { product ->
                    onProductClick(product)
                },
                onFavoriteClick = { product ->
                    FavoritesManager.toggleFavorite(product)
                    refreshTrigger++
                }
            )

            Spacer(modifier = Modifier.height(Dimens.SpacingL))
        }
    }
}
