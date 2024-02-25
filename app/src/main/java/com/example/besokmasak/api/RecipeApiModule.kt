package com.example.besokmasak.api

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn
object RecipeApiModule {
    private const val BASE_URL = "https://api.openai.com/v1/"
    private val token = ""

    private var client: OkHttpClient = OkHttpClient.Builder().addInterceptor{chain ->
      val newRequest: Request = chain.request().newBuilder().addHeader("Content-Type", "application/json")
          .addHeader("Authorization", "Bearer $token").build()
        chain.proceed(newRequest)
    }.build()

    @Provides
    @Singleton
    fun provideRecipeApiService(): RecipeApiService = Retrofit.Builder().client(client).baseUrl(
        BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(RecipeApiService::class.java)
}