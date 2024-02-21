package com.example.besokmasak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.besokmasak.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val material = binding.etMaterial.text.toString()
        val masakType = binding.etMasakType.text.toString()

        binding.btnSubmit.setOnClickListener {

        }

    }


}