package model.funcionario;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public String getRelatorio() {
        String relatorio = "\nNome: " + this.nome +
                "\nCPF: " + this.cpf +
                "\nSalario: " + this.salario +
                "\nRendimento Mensal: " + this.getRendimentoMensal();
        return relatorio;
    }

    public String getNome() {
        return nome;
    }
    
    public double getRendimentoMensal() {
        return this.salario;
    }
}

