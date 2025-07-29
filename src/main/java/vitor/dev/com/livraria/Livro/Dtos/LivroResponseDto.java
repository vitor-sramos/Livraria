package vitor.dev.com.livraria.Livro.Dtos;

import vitor.dev.com.livraria.Autor.Model.Autor;

import java.util.Set;
import java.util.UUID;

public record LivroResponseDto(

        String titulo,
        UUID id_editora,
        Set<Autor> id_autor,
        String review
) {}