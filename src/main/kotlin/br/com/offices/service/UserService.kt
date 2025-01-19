package br.com.offices.service

import br.com.offices.domain.user.CreateUserDto
import br.com.offices.domain.user.User
import br.com.offices.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun create(dto: CreateUserDto): User {
        val user = User(
            dto.nome,
            dto.email,
            dto.password
        )
        return this.userRepository.save(user)
    }

    fun findById(id: UUID): User{
        val user = this.userRepository.findById(id)
        if (user.isEmpty){
            throw NoSuchElementException("User not found with id.")
        }
        return user.get()
    }
}