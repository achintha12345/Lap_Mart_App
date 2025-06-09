package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.AccountScreenContent

object AccountScreenContentDataSource {

    fun getAccountScreenContent(): AccountScreenContent {
        return AccountScreenContent(
            screenTitleResId = R.string.account_screen_title,
            userNameResId = R.string.account_user_name,
            userLocationResId = R.string.account_user_location,
            profilePictureResId = R.drawable.profile_home_scrn,
            profilePictureDescId = R.string.account_profile_picture_desc,
            viewProfileButtonDescId = R.string.account_view_full_profile_button,
            backgroundDesc = R.string.account_background_light_decsc
        )
    }
}