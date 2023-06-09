package com.example.service

import com.example.dto.MemberDto

interface MemberService {
    suspend fun save(event:MemberDto): Boolean

    suspend fun lists(offset: Int, limit: Int): List<MemberDto>

    suspend fun update(event: MemberDto): Boolean

    suspend fun delete(memberIdx: Long): Boolean
}