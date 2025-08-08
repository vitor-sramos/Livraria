package vitor.dev.com.livraria.Livro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vitor.dev.com.livraria.Livro.Dtos.LivroRequestDto;
import vitor.dev.com.livraria.Livro.Model.Livro;
import vitor.dev.com.livraria.Livro.Service.LivroService;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @PostMapping()
    public ResponseEntity<Livro> saveLivro(@RequestBody LivroRequestDto requestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveLivro(requestDto));
    }

    @GetMapping
    public ResponseEntity<List<Livro>> getAllLivros() {
        return ResponseEntity.ok(service.getAllLivros());
    }
}
