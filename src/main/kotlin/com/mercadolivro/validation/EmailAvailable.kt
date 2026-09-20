package com.mercadolivro.validation

import jakarta.validation.Constraint
import kotlin.reflect.KClass

@Constraint(validatedBy = [EmailAvailableValidator::class])
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class EmailAvailable(
    val message : String ="Email já cadastrado",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Any>> = []
)
