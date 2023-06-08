package com.example.action

import com.example.dto.MemberDto
import com.example.service.MemberScrvice
import org.springframework.web.bind.annotation.*

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
    suspend fun list() = memberScrvice.lists()

    @PatchMapping("/update")
    suspend fun update() = mapOf("mode" to true)

    @DeleteMapping("/delete")
    suspend fun delete(): String {
        return "delete"
    }
}