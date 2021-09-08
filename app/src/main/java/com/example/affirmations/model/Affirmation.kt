package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Models [Affirmation] data object for the contents of each View in the RecyclerView.
 */

data class Affirmation(
    @StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int
    )