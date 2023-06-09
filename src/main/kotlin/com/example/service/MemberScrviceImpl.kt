package com.example.service

import com.example.dto.MemberDto
import com.example.entity.member
import org.komapper.core.dsl.Meta
import org.komapper.core.dsl.QueryDsl
import org.komapper.r2dbc.R2dbcDatabase
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service

@Service
class MemberScrviceImpl (
    private val database: R2dbcDatabase,
    private val modelMapper: ModelMapper,
): MemberScrvice {

    private val memberMeta = Meta.member

    // 회원 저장.
    override suspend fun save(event: MemberDto): Boolean {

        return database.runQuery {
            QueryDsl.insert(memberMeta).onDuplicateKeyUpdate().single(event)
        } > 0
    }

    // 회원 불러오기.
    override suspend fun lists(): List<MemberDto> {

        return database.runQuery {
            QueryDsl.from(memberMeta)
        }.map {
            modelMapper.map(it, MemberDto::class.java)
        }
    }

    // 회원정보 변경.
    override suspend fun update(event: MemberDto): Boolean {

        return database.runQuery {
            QueryDsl.update(memberMeta).set {
                memberMeta.memberName eq event.memberName
                memberMeta.memberAge eq event.memberAge
                memberMeta.memberNumber eq event.memberNumber
                memberMeta.memberAddress eq event.memberAddress
            }.where {
                memberMeta.memberIdx eq event.memberIdx
            }
        } > 0
    }

    override suspend fun delete(event: MemberDto): Boolean {
        TODO("Not yet implemented")
    }
}