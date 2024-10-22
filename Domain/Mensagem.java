package Domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMensagem;
    
    private String conteudo;
    private Date data;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "forum_id")
    private Forum forum;

    // Getters and Setters
    
    public void enviarMensagem() {
        // lógica de envio de mensagem
    }
}
