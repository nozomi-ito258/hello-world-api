package com.example.helloworldapi.controller

import com.example.helloworldapi.entity.HelloName
import javax.validation.constraints.Size
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@Validated
@RequestMapping(
    path = ["/hello"],
)
class HelloController {
    @GetMapping
    fun hello(): String = "Hello! World!"

    @GetMapping("/name")
    fun helloName(
        @RequestParam(value = "name", required = false, defaultValue = "world") name: String,
    ): String = "Hello, $name"

    @GetMapping("/json")
    fun helloJson(
        @Size(max = 10, min = 3)
        @RequestParam(value = "name", required = false, defaultValue = "world") name: String,
    ): HelloName = HelloName("Hello, $name")
}
