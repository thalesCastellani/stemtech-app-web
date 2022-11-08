package br.com.stemtech.app.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping
    @ResponseBody
    fun hello(): String {
        return "Hello World!"
    }
}