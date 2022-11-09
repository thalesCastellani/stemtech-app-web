package br.com.stemtech.app.controller

import br.com.stemtech.app.model.Curso
import br.com.stemtech.app.repository.CursoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/curso")
class CursoController(
    @Autowired
    private val cursoRepository: CursoRepository
) {
    @GetMapping
    fun lista(): List<Curso> {
        return cursoRepository.findAll()
    }

}