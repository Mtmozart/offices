package br.com.offices.domain.user

data class ResponseUserDto(
    val id: String,
    val name: String,
    val email: String,
    val password: String,
) {
    companion object {
        fun from(user: User): ResponseUserDto {
            return ResponseUserDto (
                id = user.id.toString(),
                name = user.name,
                email = user.email,
                password =  user.password
                )
        }
    }
}