package com.example.simpleapp.models

data class User(
    val username: String,
    val password: String,
    val role: Role
)

enum class Role {
    ADMIN,
    USER
}