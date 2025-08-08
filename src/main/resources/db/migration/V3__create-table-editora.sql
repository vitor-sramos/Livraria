CREATE TABLE tb_editora(
    id UUID DEFAULT uuid_generate_v4(),
    nome VARCHAR(100) NOT NULL UNIQUE,
    PRIMARY KEY(id)
);