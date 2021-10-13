package com.example.helloworldapi.controller

import com.example.helloworldapi.formatter.HelloFormatter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/helloworld")
    fun hello(): String {
        return "Hello! World!"
    }

    @GetMapping("/helloname")
    fun helloName(@RequestParam(value = "name", required = false, defaultValue = "world") name: String): String {
        return HelloFormatter(name).toHello()
    }

    @GetMapping("/hellojson")
    fun helloJson(@RequestParam(value = "name", required = false, defaultValue = "world") name: String): String {
        return HelloFormatter(name).toJson()
    }
}
