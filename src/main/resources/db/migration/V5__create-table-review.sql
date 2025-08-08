CREATE TABLE tb_review(
    id UUID DEFAULT uuid_generate_v4(),
    comentario VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
)