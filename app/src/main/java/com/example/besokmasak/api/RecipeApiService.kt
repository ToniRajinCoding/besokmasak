package com.example.besokmasak.api

import com.example.besokmasak.model.GeneratedAnswer
import com.example.besokmasak.model.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RecipeApiService {
    @POST("completions")
    fun getRecipes(@Body body: RequestBody): GeneratedAnswer
}