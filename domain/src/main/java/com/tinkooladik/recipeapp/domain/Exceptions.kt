package com.tinkooladik.recipeapp.domain

sealed class AppException(
    message: String? = null, cause: Throwable? = null
) : Throwable(message, cause)
