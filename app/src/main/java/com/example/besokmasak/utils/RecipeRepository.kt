package com.example.besokmasak.utils

import com.example.besokmasak.api.RecipeApiService
import com.example.besokmasak.model.GeneratedAnswer
import com.example.besokmasak.model.Message
import com.example.besokmasak.model.RequestBody
import javax.inject.Inject

class RecipeRepository @Inject constructor(private val recipeApiService: RecipeApiService){
    suspend fun getRecipes(message: RequestBody): GeneratedAnswer{
        return recipeApiService.getRecipes(message)
    }
}