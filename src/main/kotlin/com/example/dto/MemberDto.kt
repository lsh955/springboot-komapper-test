package com.example.dto

import java.time.LocalDateTime

data class MemberDto (
    var memberIdx: Long,
    var memberName: String,
    var memberAge: Int,
    var memberNumber: String,
    var memberAddress: String,
    var memberUpdate: LocalDateTime,
    var memberAdd: LocalDateTime
)