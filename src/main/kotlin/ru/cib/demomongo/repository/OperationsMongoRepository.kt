package ru.cib.demomongo.repository

import org.springframework.data.mongodb.repository.MongoRepository
import ru.cib.demomongo.domain.Operation

interface OperationsMongoRepository : MongoRepository<Operation, Long> {
    fun findAllByCurrency(currency: String): MutableList<Operation>
}