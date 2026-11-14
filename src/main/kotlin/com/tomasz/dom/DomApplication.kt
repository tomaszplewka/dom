package com.tomasz.dom

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DomApplication

fun main(args: Array<String>) {
	runApplication<DomApplication>(*args)
}
