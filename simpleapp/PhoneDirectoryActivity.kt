package com.example.simpleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleapp.databinding.ActivityPhoneDirectoryBinding

class PhoneDirectoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPhoneDirectoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhoneDirectoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Add logic to handle phone directory (add, display contacts)
    }
}