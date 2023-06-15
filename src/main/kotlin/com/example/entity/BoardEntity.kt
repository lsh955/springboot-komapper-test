package com.example.entity

import com.example.dto.BoardDto
import org.komapper.annotation.*

@KomapperTable("board")
@KomapperEntityDef(entity = BoardDto::class, aliases = ["board"])
data class BoardEntity(
    @KomapperId
    @KomapperAutoIncrement
    @KomapperColumn("board_idx")
    var boardIdx: Nothing,

    @KomapperColumn("board_title")
    var boardTitle: Nothing,

    @KomapperColumn("board_contents")
    var boardContents: Nothing,

    @KomapperColumn("board_update")
    var boardUpdate: Nothing,

    @KomapperColumn("board_add")
    var boardAdd: Nothing
)