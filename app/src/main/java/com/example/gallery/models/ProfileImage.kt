package com.example.gallery.models

import java.io.Serializable

data class ProfileImage(
    val large: String,
    val medium: String,
    val small: String
): Serializable