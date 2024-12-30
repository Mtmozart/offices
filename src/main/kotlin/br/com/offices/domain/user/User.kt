package br.com.offices.domain.user

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.UUID

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    val name: String,
    val email: String,
    val password: String,
 ){
    override fun toString(): String {
        return "User(id=$id, name='$name', email='$email', password='$password')"
    }
}
