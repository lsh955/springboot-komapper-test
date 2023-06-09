package com.example.action

import com.example.dto.MemberDto
import com.example.service.MemberService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/member")
class MemberController(
    private val memberService: MemberService
) {
    @PostMapping("/save")
    suspend fun save(@RequestBody memberDto: MemberDto)= mapOf("state" to memberService.save(memberDto))

    @GetMapping("/list")
    suspend fun list(@RequestParam offset: Int, @RequestParam limit: Int) = memberService.lists(offset, limit)

    @PutMapping("/update")
    suspend fun update(@RequestBody memberDto: MemberDto) = memberService.update(memberDto)

    @DeleteMapping("/delete")
    suspend fun delete(@RequestBody memberDto: MemberDto) = mapOf("state" to memberService.delete(memberDto.memberIdx))
}