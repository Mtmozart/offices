package br.com.offices.domain.user

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    val name: String = "",
    val email: String = "",
    val password: String = ""
) {

    constructor() : this(id = null, name = "", email = "", password = "")

     constructor(name: String, email: String, password: String) : this(
        id = null,
        name = name,
        email = email,
        password = password
    )

    override fun toString(): String {
        return "User(id=$id, name='$name', email='$email', password='$password')"
    }
}
