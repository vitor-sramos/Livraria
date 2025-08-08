package vitor.dev.com.livraria.Livro.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vitor.dev.com.livraria.Autor.Repository.AutorRepository;
import vitor.dev.com.livraria.Editora.Repository.EditoraRepository;
import vitor.dev.com.livraria.Livro.Dtos.LivroRequestDto;
import vitor.dev.com.livraria.Livro.Model.Livro;
import vitor.dev.com.livraria.Livro.Repository.LivroRepository;
import vitor.dev.com.livraria.Review.Model.Review;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LivroService {

    private LivroRepository livroRepository;
    private AutorRepository autorRepository;
    private EditoraRepository editoraRepository;

    @Transactional
    public Livro saveLivro(LivroRequestDto requestDto) {
        Livro newLivro = new Livro();

        newLivro.setTitulo(requestDto.titulo());
        newLivro.setEditora(editoraRepository.findById(requestDto.id_editora()).get());
        newLivro.setAutores(autorRepository.findAllById(requestDto.id_autores()).stream().collect(Collectors.toSet()));

        Review reviewLivro = new Review();
        reviewLivro.setLivro(newLivro);
        reviewLivro.setComentario(requestDto.review());

        newLivro.setReview(reviewLivro);

        return livroRepository.save(newLivro);
    }

    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }
}