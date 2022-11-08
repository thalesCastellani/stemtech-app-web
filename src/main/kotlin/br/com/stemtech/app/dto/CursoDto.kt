package br.com.stemtech.app.dto

import br.com.stemtech.app.model.Categoria

data class CursoDto(
    private val nome: String,
    private val formacao: String,
    private val categoria: Categoria
)
