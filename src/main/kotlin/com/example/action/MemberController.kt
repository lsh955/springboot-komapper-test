package com.example.action

import com.example.dto.MemberDto
import com.example.service.MemberScrvice
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class MemberController(
    private val memberScrvice: MemberScrvice
) {
    @PostMapping("/save")
    suspend fun save(@RequestBody event:MemberDto): String {
        return "save"
    }

    @GetMapping("/list")
    suspend fun list() = mapOf("mode" to true)

    @PatchMapping("/update")
    suspend fun update(): String {
        return "update"
    }

    @DeleteMapping("/delete")
    suspend fun delete(): String {
        return "delete"
    }
}