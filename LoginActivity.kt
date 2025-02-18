package com.example.simpleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            if (validateCredentials(username, password)) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Неверный логин или пароль", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validateCredentials(username: String, password: String): Boolean {
        return (username == "admin" && password == "admin") || (username == "User" && password == "User")
    }
}