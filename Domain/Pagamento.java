package Domain;

import javax.persistence.*;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String formaPagamento;
    private double valor;
    
    @ManyToOne
    @JoinColumn(name = "servico_id")
    private Servico servico;
    
    @ManyToOne
    @JoinColumn(name = "usuario_pagador_id")
    private Usuario usuarioPagador;
    
    @ManyToOne
    @JoinColumn(name = "usuario_prestador_id")
    private Usuario usuarioPrestador;

    // Getters and Setters
    
    public void efetuarPagamento() {
        // lógica de pagamento
    }
}
