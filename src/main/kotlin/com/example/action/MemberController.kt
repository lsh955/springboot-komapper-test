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
    suspend fun save(@RequestBody event:MemberDto) = mapOf("state" to memberScrvice.save(event))

    @GetMapping("/list")
    suspend fun list() = memberScrvice.lists()

    @PatchMapping("/update")
    suspend fun update() = mapOf("mode" to "update")

    @DeleteMapping("/delete")
    suspend fun delete() = mapOf("mode" to "delete")
}