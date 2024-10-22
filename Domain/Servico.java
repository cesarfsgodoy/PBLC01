package Domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    private String descricao;
    private Date dataCadastro;
    private int data;
    private double avaliacao;

    @ManyToMany(mappedBy = "servicos")
    private List<Usuario> usuarios;
    
    @ManyToMany
    @JoinTable(
        name = "servico_tag",
        joinColumns = @JoinColumn(name = "servico_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;

    // Getters and Setters
    
    public void cadastrarServico() {
        // lógica de cadastro de serviço
    }

    public void pesquisarServico() {
        // lógica de pesquisa de serviço
    }

    public void filtrarGeografico() {
        // lógica de filtro geográfico
    }
    
    public void filtrarTag() {
        // lógica de filtro por tag
    }
}
