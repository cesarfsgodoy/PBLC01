package Domain;

import java.util.Date;
import java.util.List;

public class Servico {
    private String titulo;
    private String descricao;
    private String regiao;
    private List<Tag> tags;
    private Date dataCadastro;
    private int id;
    private double avalicao;
    private Usuario usuario;

    public Servico(Usuario u){
        this.usuario = u;
    }

    public void pesquisarServico(){

    }

    public void filtroGeografico(){

    }

    public void filtroTag(){

    }
}