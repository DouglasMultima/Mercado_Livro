package com.mercadolivro.controller.request


import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty

data class PutCustomerRequest (

    @field:NotEmpty(message = "Nome deve ser Informado")

    var name: String,

    @field:Email (message = "E-mail deve ser válido")
    var email: String,
)