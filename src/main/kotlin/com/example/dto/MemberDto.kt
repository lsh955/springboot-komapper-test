package com.example.dto

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime

data class MemberDto (
    var memberIdx: Long,
    var memberName: String,
    var memberAge: Int,
    var memberNumber: String,
    var memberAddress: String,
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    var memberUpdate: LocalDateTime,
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    var memberAdd: LocalDateTime
)