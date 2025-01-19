package br.com.offices.domain.user

data class CreateUserDto(
    val nome: String,
    val email: String,
    val password: String,
)
