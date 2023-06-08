package com.example.entity

import com.example.dto.MemberDto
import org.komapper.annotation.*

@KomapperTable("member")
@KomapperEntityDef(entity = MemberDto::class, aliases = ["member"])
data class MemberEntity(
    @KomapperId
    @KomapperAutoIncrement
    @KomapperColumn("member_idx")
    var memberIdx: Nothing,

    @KomapperColumn("member_name")
    var memberName: Nothing,

    @KomapperColumn("member_age")
    var memberAge: Nothing,

    @KomapperColumn("member_number")
    var memberNumber: Nothing,

    @KomapperColumn("member_address")
    var memberAddress: Nothing,

    @KomapperColumn("member_update")
    var memberUpdate: Nothing,

    @KomapperColumn("member_add")
    var memberAdd: Nothing
)