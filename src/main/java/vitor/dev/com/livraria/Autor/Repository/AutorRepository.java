package vitor.dev.com.livraria.Autor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vitor.dev.com.livraria.Autor.Model.Autor;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
