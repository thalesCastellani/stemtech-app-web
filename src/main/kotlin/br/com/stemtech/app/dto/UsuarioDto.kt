package br.com.stemtech.app.dto

import br.com.stemtech.app.model.Curso
import br.com.stemtech.app.model.Usuario
import javax.validation.constraints.Pattern

data class UsuarioDto(

    private val nome: String,

    @Pattern(regexp = "^([0-9]{3}\\.?){3}-?[0-9]{2}$", message = "Deve seguir o padrão: 000.000.000-00")
    private val cpf: String,

    @Pattern(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", message = "Deve seguir o padrão: nome@email.com")
    private val email: String,

    @Pattern(regexp = "^((\\(\\d{2}\\))|\\d{2})[- .]?\\d{5}[- .]?\\d{4}$", message = "Deve seguir o padrão: (11) 99999-9999")
    private val telefone: String,

    private val cursos: List<Curso>?
) {

    fun converte(usuarioDto: UsuarioDto): Usuario {
        val nome: String = usuarioDto.nome
        val cpf: String = usuarioDto.cpf
        val email: String = usuarioDto.email
        val telefone: String = usuarioDto.telefone
        val cursos: List<Curso>? = usuarioDto.cursos

        return Usuario(
            nome = nome,
            cpf = cpf,
            email = email,
            telefone = telefone,
            cursos = cursos
        )
    }
}
