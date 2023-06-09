package com.example.service

import com.example.dto.MemberDto
import com.example.entity.member
import org.komapper.core.dsl.Meta
import org.komapper.core.dsl.QueryDsl
import org.komapper.r2dbc.R2dbcDatabase
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl (
    private val database: R2dbcDatabase
): MemberService {

    private val memberMeta = Meta.member

    // 회원정보 저장.
    override suspend fun save(event: MemberDto): Boolean {

        return database.runQuery {
            QueryDsl.insert(memberMeta)
                .onDuplicateKeyUpdate()
                .single(event)
        } > 0
    }

    // 회원정보 불러오기.
    override suspend fun lists(offset: Int, limit: Int): List<MemberDto> {

        return database.runQuery {
            QueryDsl.from(memberMeta).offset(offset).limit(limit)
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

    // 회원정보 삭제.
    override suspend fun delete(memberIdx: Long): Boolean {

        return database.runQuery {
            QueryDsl.delete(memberMeta).where {
                memberMeta.memberIdx eq memberIdx
            }
        } > 0
    }
}