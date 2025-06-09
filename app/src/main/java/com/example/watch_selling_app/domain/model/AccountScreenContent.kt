package com.example.watch_selling_app.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class AccountScreenContent(
    @StringRes val backgroundDesc : Int,
    @StringRes val screenTitleResId: Int,
    @StringRes val userNameResId: Int,
    @StringRes val userLocationResId: Int,
    @DrawableRes val profilePictureResId: Int,
    @StringRes val profilePictureDescId: Int,
    @StringRes val viewProfileButtonDescId: Int,

)
