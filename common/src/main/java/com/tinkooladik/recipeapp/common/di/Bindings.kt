package com.tinkooladik.recipeapp.common.di

import com.tinkooladik.recipeapp.data.LoggingErrorInterceptor
import com.tinkooladik.recipeapp.domain.ErrorInterceptor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class Bindings {

    @Binds
    abstract fun provideErrorInterceptor(interceptor: LoggingErrorInterceptor): ErrorInterceptor
}