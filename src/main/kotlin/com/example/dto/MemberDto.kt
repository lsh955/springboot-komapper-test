package com.example.dto

import java.time.format.DateTimeFormatter

data class MemberDto (
    var memberIdx: Long,
    var memberName: String,
    var memberAge: Int,
    var memberNumber: Int,
    var memberAddress: String,
    var memberUpdate: DateTimeFormatter,
    var memberAdd: DateTimeFormatter
)