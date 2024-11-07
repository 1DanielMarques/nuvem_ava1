package com.example.demo.resource

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/calculator")
class CalculatorResource {

    @GetMapping("/add")
    fun add(@RequestParam a: Int, @RequestParam b: Int): Int {
        return a + b
    }
    @GetMapping("/subtract")
    fun subtract(@RequestParam a: Int, @RequestParam b: Int): Int {
        return a - b
    }
    @GetMapping("/multiply")
    fun multiply(@RequestParam a: Int, @RequestParam b: Int): Int {
        return a * b
    }
    @GetMapping("/divide")
    fun divide(@RequestParam a: Int, @RequestParam b: Int): ResponseEntity<Double> {
        return if (b != 0) {
            ResponseEntity.ok(a.toDouble() / b)
        } else {
            ResponseEntity.badRequest().body(null)
        }
    }
}
