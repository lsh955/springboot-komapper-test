package com.example.service

import com.example.dto.MemberDto

interface MemberScrvice {
    suspend fun save(event:MemberDto):Boolean

    suspend fun lists(event: MemberDto):List<MemberDto>

    suspend fun update(event: MemberDto): Boolean

    suspend fun delete(event: MemberDto): Boolean
}