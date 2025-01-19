package br.com.offices.domain.office

import jakarta.persistence.Column
import jakarta.persistence.Embeddable


@Embeddable
class Address  (
    @Column(name = "address_name")
    val number: String,
    val street: String,
    val neighborhoo: String,
    val city: String,
    val state: String,
    val country: String,
    @Column(name = "postal_code")
    val postalCode: String,
    val longetude: String? = null,
    val latitude: String? = null
){



}