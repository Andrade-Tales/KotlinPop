package com.lista.kotlinpop.model

class User(
    val id: Long,
    val titulo: String,
    val descricao: String,
    val nome: String,
    val sobrenome: String,
    var link: String,
    val usuarioId: String? = null
)
