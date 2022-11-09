package br.com.stemtech.app.model

import javax.persistence.*

@Entity
@Table(name = "TB_ST_CURSO")
data class Curso(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    val id: Long,

    @Column(name = "nm_curso")
    val nome: String?,

    @Column(name = "nm_formacao")
    val formacao: String?,

    @Column(name = "tp_categoria")
    @Enumerated(EnumType.STRING)
    val categoria: Categoria?
)

