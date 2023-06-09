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
    suspend fun save(@RequestBody memberDto: MemberDto)= mapOf("state" to memberScrvice.save(memberDto))

    @GetMapping("/list")
    suspend fun list(@RequestParam offset: Int, @RequestParam limit: Int) = memberScrvice.lists(offset, limit)

    @PutMapping("/update")
    suspend fun update(@RequestBody memberDto: MemberDto) = memberScrvice.update(memberDto)

    @DeleteMapping("/delete")
    suspend fun delete(@RequestBody memberDto: MemberDto) = mapOf("state" to memberScrvice.delete(memberDto.memberIdx))
}