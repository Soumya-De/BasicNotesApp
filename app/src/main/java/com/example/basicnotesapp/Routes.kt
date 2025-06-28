package com.example.basicnotesapp

import kotlinx.serialization.Serializable

sealed class Routes {
    @Serializable
    object ShowData

    @Serializable
    object EnterData
}