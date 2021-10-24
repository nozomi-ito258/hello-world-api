package com.example.helloworldapi.controller

import com.example.helloworldapi.entity.HelloName
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(
    path = ["/hello"],
)
class HelloController {
    @GetMapping
    fun hello(): String = "Hello! World!"

    @GetMapping("/name")
    fun helloName(
        @RequestParam(value = "name", required = false, defaultValue = "world") name: String
    ): String = "Hello, $name"


    @GetMapping("/json")
    fun helloJson(
        @RequestParam(value = "name", required = false, defaultValue = "world") name: String
    ): HelloName = HelloName("Hello, $name")

    @GetMapping("/error")
    fun error(): Error = throw RuntimeException("sorry my bad :(")
}
