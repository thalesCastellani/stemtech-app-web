package br.com.stemtech.app.model

import javax.persistence.*

@Entity
@Table(name = "TB_ST_USUARIO")
data class Usuario(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private val id: Long,

    @Column(name = "nm_usuario", nullable = false)
    private val nome: String,

    @Column(name = "nr_cpf", nullable = false, unique = true)
    private val cpf: String,

    @Column(name = "ds_email", nullable = false, unique = true)
    private val email: String,

    @Column(name = "nr_telefone", nullable = false, unique = true)
    private val telefone: String,

    @ManyToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @Column(name = "ds_cursos")
    private val curso: List<Curso>
)


