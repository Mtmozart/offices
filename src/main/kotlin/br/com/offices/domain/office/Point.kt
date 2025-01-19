package br.com.offices.domain.office

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "point")
class Point  (

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    val name: String,
    @Embedded()
    val address: Address
){
    override fun toString(): String {
        return "Point(id=$id, name='$name', address=$address)"
    }
}