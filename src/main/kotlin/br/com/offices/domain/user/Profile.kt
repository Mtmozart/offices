package br.com.offices.domain.user

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

class Profile (
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: Long,
    val typeProfile: TypeProfile,


) {
}