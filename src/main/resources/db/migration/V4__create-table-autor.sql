CREATE TABLE tb_autor(
    id UUID DEFAULT uuid_generate_v4(),
    nome VARCHAR(100) NOT NULL UNIQUE,
    PRIMARY KEY(id)
)