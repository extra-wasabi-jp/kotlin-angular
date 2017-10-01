package com.futsalud.kotlin_angular.ka0001.controller

import com.futsalud.kotlin_angular.ka0001.dto.Ka0001Dto
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Ka0001Controller {

    private var log = LoggerFactory.getLogger(Ka0001Controller::class.java)

    @RequestMapping("/ka0001/")
    fun def(): String {
        log.debug("START")
        log.debug("END")
        return "Hello"
    }

    @CrossOrigin
    @RequestMapping("ka0001/userlist")
    fun userlist(): List<Ka0001Dto> {
        log.debug("START")

        val userList = mutableListOf<Ka0001Dto>()

        val user1 = Ka0001Dto()
        user1.userId = 1000001
        user1.accountId = "direct.k"
        user1.userNm = "ダイレクト　会長"
        user1.email = "direct.k@l-ain.com"
        userList.add(user1)

        val user2 = Ka0001Dto()
        user2.userId = 1000002
        user2.accountId = "direct.p"
        user2.userNm = "ダイレクト　社長"
        user2.email = "direct.p@l-ain.com"
        userList.add(user2)

        val user3 = Ka0001Dto()
        user3.userId = 1000003
        user3.accountId = "direct.s"
        user3.userNm = "ダイレクト　センム"
        user3.email = "direct.s@l-ain.com"
        userList.add(user3)

        log.debug("END")
        return userList
    }

}