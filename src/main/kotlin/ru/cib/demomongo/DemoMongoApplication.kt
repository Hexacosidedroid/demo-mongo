package ru.cib.demomongo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoMongoApplication

fun main(args: Array<String>) {
    runApplication<DemoMongoApplication>(*args)
}
