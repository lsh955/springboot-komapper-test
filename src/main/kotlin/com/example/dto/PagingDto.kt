package com.example.dto

class PagingDto(
    var page: Int = 0, // 페이지 시작
    var limit: Int = 0 // 게시물 개수
) {}