package vitor.dev.com.livraria.Livro.Dtos;

import vitor.dev.com.livraria.Autor.Model.Autor;

import java.util.Set;
import java.util.UUID;

public record LivroRequestDto(

        String titulo,
        UUID id_editora,
        Set<UUID> id_autores,
        String review
) {}