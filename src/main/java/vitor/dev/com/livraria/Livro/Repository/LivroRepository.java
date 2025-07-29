package vitor.dev.com.livraria.Livro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vitor.dev.com.livraria.Livro.Model.Livro;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
