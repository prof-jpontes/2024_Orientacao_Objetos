package model.cliente;

public abstract class Cliente {
    protected String nome;
    protected String telefone;
    protected String endereco;

    // Construtor da classe
    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public abstract String getRelatorio();

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        if(this.endereco != null){
            return "Endereço: " +  this.endereco ;
        }
        return "";
    }

    public String getNome() {
        return nome;
    }
    
}

