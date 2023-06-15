package com.example.service

import com.example.dto.BoardDto
import com.example.dto.PagingDto
import org.springframework.web.bind.annotation.RequestBody

interface BoardService {
    /**
     * 게시물 저장
     */
    suspend fun save(boardDto: BoardDto): Boolean

    /**
     * 게시물 불러오기
     */
    suspend fun lists(@RequestBody pagingDto: PagingDto): List<BoardDto>

    /**
     * 게시물 수정
     */
    suspend fun update(boardDto: BoardDto): Boolean

    /**
     * 게시물 삭제
     */
    suspend fun delete(boardIdx: Long): Boolean
}