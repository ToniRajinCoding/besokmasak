package com.example.besokmasak.utils

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.besokmasak.model.RequestBody
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(val repository: RecipeRepository) : ViewModel() {

    private val _response = MutableLiveData<String>()
    val response: LiveData<String>
        get() = _response

    fun sendPrompt(requestBody: RequestBody){
        viewModelScope.launch {
            val response = repository.getRecipes(requestBody)

            _response.value = response.choices[0].message.content

            Log.e("TAG", response.choices[0].message.content)
            Log.e("TAG", response.choices[0].message.content)
            Log.e("TAG", response.choices[0].index.toString())
            Log.e("TAG", response.choices[0].finish_reason)
            Log.e("TAG", response.model)
            Log.e("TAG", response.usage.total_tokens.toString())

        }
    }

}