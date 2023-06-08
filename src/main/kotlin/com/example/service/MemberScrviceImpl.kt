package com.example.service

import com.example.dto.MemberDto
import org.komapper.r2dbc.R2dbcDatabase
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service

@Service
class MemberScrviceImpl (
    private val database: R2dbcDatabase,
    private val modelMapper: ModelMapper,
): MemberScrvice {
    override suspend fun save(event: MemberDto): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun lists(event: MemberDto): List<MemberDto> {
        TODO("Not yet implemented")
    }

    override suspend fun update(event: MemberDto): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun delete(event: MemberDto): Boolean {
        TODO("Not yet implemented")
    }
}