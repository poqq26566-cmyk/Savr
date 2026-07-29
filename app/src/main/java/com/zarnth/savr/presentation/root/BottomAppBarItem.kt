package com.zarnth.savr.presentation.root

import com.zarnth.savr.R

data class BottomAppBarItem(
    val titleRes: Int,  // 改为资源ID
    val icon: Int,
    val iconFilled: Int
)

val bottomAppBarItems = listOf(
    BottomAppBarItem(
        titleRes = R.string.nav_home,
        icon = R.drawable.home_icon,
        iconFilled = R.drawable.home_icon_filled
    ),
    BottomAppBarItem(
        titleRes = R.string.nav_collections,
        icon = R.drawable.bookmark_one,
        iconFilled = R.drawable.bookmark_fill
    ),
    BottomAppBarItem(
        titleRes = R.string.nav_settings,
        icon = R.drawable.setting_icon,
        iconFilled = R.drawable.setting_icon_filled
    )
)
