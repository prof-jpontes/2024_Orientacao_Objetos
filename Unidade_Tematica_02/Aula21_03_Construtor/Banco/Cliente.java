public class Cliente {
    public String nome;
    public String cpf;
    public String telefone;

    // Construtor
    public Cliente(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getRelatorio(){
        String s = "\nNome: " + this.nome;
        s+= "\nCPF: " + this.cpf;
        s+= "\nTelefone: " + this.telefone;
        return s;
    }
}