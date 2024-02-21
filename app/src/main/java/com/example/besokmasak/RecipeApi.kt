package com.example.besokmasak

import com.example.besokmasak.entity.GeneratedAnswer
import retrofit2.Response
import retrofit2.http.GET

interface RecipeApi {

    @GET("/todos")
    fun getRecipes(): Response<List<GeneratedAnswer>>
}