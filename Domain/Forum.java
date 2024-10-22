package Domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToMany(mappedBy = "forum", cascade = CascadeType.ALL)
    private List<Mensagem> mensagens;

    @OneToOne
    @JoinColumn(name = "servico_id")
    private Servico servico;

    // Getters and Setters

    public void enviarMensagem() {
        // lógica de envio de mensagem no fórum
    }
}
