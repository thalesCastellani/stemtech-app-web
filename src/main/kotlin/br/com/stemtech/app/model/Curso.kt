package br.com.stemtech.app.model

import javax.persistence.*

@Entity
@Table(name = "TB_ST_CURSO")
data class Curso(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private val id: Long,

    @Column(name = "nm_curso")
    private val nome: String?,

    @Column(name = "nm_formacao")
    private val formacao: String?,

    @Column(name = "tp_categoria")
    @Enumerated(EnumType.STRING)
    private val categoria: Categoria?
)

