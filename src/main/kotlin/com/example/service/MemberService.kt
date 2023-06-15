package com.example.service

import com.example.dto.MemberDto

interface MemberService {
    /**
     * 회원 저장
     */
    suspend fun save(event:MemberDto): Boolean

    /**
     * 회원 불러오기
     */
    suspend fun lists(offset: Int, limit: Int): List<MemberDto>

    /**
     * 회원 수정
     */
    suspend fun update(event: MemberDto): Boolean

    /**
     * 회원 삭제
     */
    suspend fun delete(memberIdx: Long): Boolean
}