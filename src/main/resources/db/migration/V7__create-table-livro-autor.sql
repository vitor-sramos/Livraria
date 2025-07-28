CREATE TABLE tb_livro_autor(
	id_livro UUID,
	id_autor UUID,
	PRIMARY KEY(id_livro, id_autor),
	CONSTRAINT fk_livro FOREIGN KEY(id_livro) REFERENCES tb_livro(id),
	CONSTRAINT fk_autor FOREIGN KEY(id_autor) REFERENCES tb_autor(id)
)