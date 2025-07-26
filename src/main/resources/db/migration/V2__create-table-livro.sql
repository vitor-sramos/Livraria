 CREATE TABLE tb_livro(
    id UUID DEFAULT uuid_generate_v4(),
    titulo VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
 )