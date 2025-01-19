package br.com.offices.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HellorWorld {
    @GetMapping("/")
    fun hellorWorld(): ResponseEntity<String> {
        return ResponseEntity.ok().body("Hellor world")
    }
}