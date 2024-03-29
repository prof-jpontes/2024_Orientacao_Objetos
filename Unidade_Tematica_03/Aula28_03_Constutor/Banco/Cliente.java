public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    // Construtor
    public Cliente(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    // Contrutor 2
    public Cliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    // Metodo "Acessador"/get
    public String getNome() {
        return this.nome;
    }

    // Metodo "Acessador"/get
    public String getCpf() {
        return this.cpf;
    }

    // Metodo "Acessador"/get.
    public String getTelefone() {
        return this.telefone;
    }

    public String getRelatorio(){
        String s = "\nNome: " + this.nome;
        s+= "\nCPF: " + this.cpf;
        s+= "\nTelefone: " + this.telefone;
        return s;
    }
}
