package br.com.offices.controller

import br.com.offices.domain.user.CreateUserDto
import br.com.offices.domain.user.ResponseUserDto
import br.com.offices.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService
) {
    @PostMapping()
    fun create(@RequestBody dto: CreateUserDto): ResponseEntity<ResponseUserDto> {
        return ResponseEntity.status(HttpStatus.CREATED).body(ResponseUserDto.from(userService.create(dto)))
    }

    @GetMapping("{id}")
    fun findById(@PathVariable id: UUID): ResponseEntity<ResponseUserDto> {
        return ResponseEntity.ok(ResponseUserDto.from(userService.findById(id)))
    }

}