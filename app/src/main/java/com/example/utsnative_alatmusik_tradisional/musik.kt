package com.example.utsnative_alatmusik_tradisional

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class musik(
    val imgMusik: Int,
    val nameMusik: String,
    val descMusik: String
) : Parcelable
