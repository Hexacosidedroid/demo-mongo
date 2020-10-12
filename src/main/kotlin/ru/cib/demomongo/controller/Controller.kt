package ru.cib.demomongo.controller

import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import ru.cib.demomongo.domain.Operation
import ru.cib.demomongo.repository.OperationsMongoRepository
import java.math.BigDecimal

private val logger = KotlinLogging.logger {}

@RestController
class Controller(
        val operationsMongoRepository: OperationsMongoRepository
) {

    @GetMapping("/get")
    fun getOperations(): MutableList<Operation> = operationsMongoRepository.findAll()

    @GetMapping("/fill")
    fun fillOperations() {
        operationsMongoRepository.save(Operation()
                .apply {
                    fromAccount = "40817810570000123456"
                    toAccount = "40817810570000654321"
                    amount = BigDecimal(100.00)
                    currency = "RUB"
                    date = "05.10.2020"
                })
    }

    @GetMapping("/delete")
    fun deleteOperations() {
        operationsMongoRepository.findAll().forEach {
            operationsMongoRepository.delete(it)
        }
    }

    @PostMapping("/post")
    fun postOperations() {

    }
}