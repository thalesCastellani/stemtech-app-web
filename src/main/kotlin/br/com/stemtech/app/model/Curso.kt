package br.com.stemtech.app.model

import br.com.stemtech.app.dto.CursoDto
import java.util.function.Function
import java.util.stream.Collectors
import javax.persistence.*


@Entity
@Table(name = "TB_ST_CURSO")
data class Curso(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private val id: Long? = null,

    @Column(name = "nm_curso", nullable = false)
    private val nome: String,

    @Column(name = "nm_formacao", nullable = false)
    private val formacao: String,

    @Column(name = "tp_categoria")
    @Enumerated(EnumType.STRING)
    private val categoria: Categoria
) {
    fun converte(cursoDto: List<CursoDto?>): List<Curso>? {
        return cursoDto.stream().map(Curso()).collect(Collectors.toList())
    }
}

