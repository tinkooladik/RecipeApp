package com.tinkooladik.recipeapp.domain

interface ErrorInterceptor {
    fun intercept(error: Throwable) {}
}