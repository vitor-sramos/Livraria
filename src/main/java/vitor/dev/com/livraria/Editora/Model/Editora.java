package vitor.dev.com.livraria.Editora.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

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
}
