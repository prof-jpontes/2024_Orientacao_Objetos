package model.funcionario;

import model.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
    private String setor;
    private String senha;
    
    public Gerente(String nome, String cpf, double salario, String setor) {
        super(nome, cpf, salario);
        this.setor = setor;
        this.senha = "ger1234";
    }

    @Override
    public String getRelatorio() {
        return super.getRelatorio() + "\nÉ um gerente!";
    }

    @Override
    public double getRendimentoMensal() {
        return super.getRendimentoMensal() + 4000;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
}
