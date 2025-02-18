package com.example.simpleapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.phoneDirectoryButton.setOnClickListener {
            startActivity(Intent(this, PhoneDirectoryActivity::class.java))
        }

        binding.tasksButton.setOnClickListener {
            startActivity(Intent(this, TasksActivity::class.java))
        }

        binding.meetingRoomsButton.setOnClickListener {
            startActivity(Intent(this, MeetingRoomsActivity::class.java))
        }

        binding.adminButton.setOnClickListener {
            startActivity(Intent(this, AdminActivity::class.java))
        }
    }
}