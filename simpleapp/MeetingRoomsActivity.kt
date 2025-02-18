package com.example.simpleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleapp.databinding.ActivityMeetingRoomsBinding

class MeetingRoomsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMeetingRoomsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMeetingRoomsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Add logic to handle meeting rooms
    }
}