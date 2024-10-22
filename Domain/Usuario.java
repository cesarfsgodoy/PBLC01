package Domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String email;
    private String senha;
    private double avaliacao;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Mensagem> mensagens;

    @ManyToMany
    @JoinTable(
        name = "usuario_servico",
        joinColumns = @JoinColumn(name = "usuario_id"),
        inverseJoinColumns = @JoinColumn(name = "servico_id")
    )
    private List<Servico> servicos;

    // Getters and Setters

    public void cadastrar() {
        // lógica de cadastro
    }
    
    public void login() {
        // lógica de login
    }
    
    public void avaliar() {
        // lógica de avaliação
    }
}
