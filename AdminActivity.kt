package com.example.simpleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleapp.databinding.ActivityAdminBinding

class AdminActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdminBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Add logic to handle admin functionality (add users, manage data)
    }
}