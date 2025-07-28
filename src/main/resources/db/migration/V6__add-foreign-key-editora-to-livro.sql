ALTER TABLE tb_livro
ADD id_editora UUID,
ADD CONSTRAINT fk_livro_editora
FOREIGN KEY(id_editora) REFERENCES tb_editora(id);