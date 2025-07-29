package vitor.dev.com.livraria.Editora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vitor.dev.com.livraria.Editora.Model.Editora;

import java.util.UUID;

public interface EditoraRepository extends JpaRepository<Editora, UUID> {
}
