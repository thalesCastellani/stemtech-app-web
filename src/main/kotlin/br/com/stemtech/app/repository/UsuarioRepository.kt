package br.com.stemtech.app.repository

import br.com.stemtech.app.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository : JpaRepository<Usuario, Long> {
    fun save(usuario: Usuario?)

}
