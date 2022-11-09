INSERT INTO TB_ST_USUARIO(nm_usuario, nr_cpf, ds_email, nr_telefone) VALUES('Thales Castellani', '98765432100', 'thales@email.com', '11941415252');
INSERT INTO TB_ST_USUARIO(nm_usuario, nr_cpf, ds_email, nr_telefone) VALUES('Amanda Marques', '12345678900', 'amanda@email.com', '11952526363');
INSERT INTO TB_ST_USUARIO(nm_usuario, nr_cpf, ds_email, nr_telefone) VALUES('Amora Castellani', '45612378900', 'amora@email.com', '11978784545');

INSERT INTO TB_ST_CURSO(nm_curso, nm_formacao, tp_categoria) VALUES('Java', 'Backend', 'PROGRAMACAO');
INSERT INTO TB_ST_CURSO(nm_curso, nm_formacao, tp_categoria) VALUES('React', 'Frontend', 'PROGRAMACAO');
INSERT INTO TB_ST_CURSO(nm_curso, nm_formacao, tp_categoria) VALUES('Python', 'Dados', 'DATA_SCIENCE');

INSERT INTO TB_ST_USUARIO_CURSOS(usuario_id_usuario, cursos_id_curso) VALUES(1, 1);
INSERT INTO TB_ST_USUARIO_CURSOS(usuario_id_usuario, cursos_id_curso) VALUES(1, 2);
INSERT INTO TB_ST_USUARIO_CURSOS(usuario_id_usuario, cursos_id_curso) VALUES(1, 3);

INSERT INTO TB_ST_USUARIO_CURSOS(usuario_id_usuario, cursos_id_curso) VALUES(2, 1);
INSERT INTO TB_ST_USUARIO_CURSOS(usuario_id_usuario, cursos_id_curso) VALUES(2, 2);
INSERT INTO TB_ST_USUARIO_CURSOS(usuario_id_usuario, cursos_id_curso) VALUES(2, 3);

INSERT INTO TB_ST_USUARIO_CURSOS(usuario_id_usuario, cursos_id_curso) VALUES(3, 1);
INSERT INTO TB_ST_USUARIO_CURSOS(usuario_id_usuario, cursos_id_curso) VALUES(3, 2);
INSERT INTO TB_ST_USUARIO_CURSOS(usuario_id_usuario, cursos_id_curso) VALUES(3, 3);