package Domain;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private int id;
    private double avalicao;
    private Servico servico = null;

    public void cadastrar(String email, String nome, String senha){
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }
    public void login(String email, String senha){

    }
    public void pesquisar(String nome){

    }
    public void avaliar(Usuario u, double nota){

    }
}
