package com.example.userboard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UserBoardApplication

fun main(args: Array<String>) {
    runApplication<UserBoardApplication>(*args)
}
