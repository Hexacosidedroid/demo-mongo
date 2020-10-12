package ru.cib.demomongo.domain

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId
import java.math.BigDecimal
import java.util.*

@Document(collection = "operation")
data class Operation (
        @field:MongoId
        var id: String? = null,
        var fromAccount: String? = null,
        var toAccount: String? = null,
        var amount: BigDecimal? = null,
        var currency: String? = null,
        var date: String? = null
)