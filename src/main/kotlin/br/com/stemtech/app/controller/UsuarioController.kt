package br.com.stemtech.app.controller

import br.com.stemtech.app.dto.UsuarioDto
import br.com.stemtech.app.model.Usuario
import br.com.stemtech.app.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import java.net.URI
import javax.transaction.Transactional
import javax.validation.Valid


@RestController
@RequestMapping("/usuario")
class UsuarioController(
    @Autowired
    private val usuarioRepository: UsuarioRepository
) {

    @PostMapping
    @Transactional
    fun cadastra(
        @RequestBody @Valid usuarioDto: UsuarioDto,
        uriComponentsBuilder: UriComponentsBuilder
    ): ResponseEntity<Usuario> {
        val usuario: Usuario = usuarioDto.converte(usuarioDto)
        usuarioRepository.save(usuario)
        val uri: URI = uriComponentsBuilder.path("/usuario/{id}").buildAndExpand(usuario.id).toUri()
        return ResponseEntity.created(uri).body(usuario)
    }

}