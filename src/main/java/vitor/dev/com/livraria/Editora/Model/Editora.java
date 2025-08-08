package vitor.dev.com.livraria.Editora.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vitor.dev.com.livraria.Livro.Model.Livro;

import java.util.*;

@Entity
@Table(name = "tb_editora")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    private String nome;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "editora", fetch = FetchType.LAZY)
    private Set<Livro> livros = new HashSet<>();
}