package com.example.helloworldapi.formatter

class HelloFormatter(val str: String) {
    fun toHello(): String = "Hello, $str"
    fun toJson(): String = "{\"message\":\"Hello, $str\"}"
}