package Domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;

    @ManyToMany(mappedBy = "tags")
    private List<Servico> servicos;

    // Getters and Setters
    
    public void associarTag() {
        // lógica de associação de tag
    }
}

