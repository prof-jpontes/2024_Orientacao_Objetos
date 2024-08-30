package model.funcionario;

import model.Autenticavel;

public class Vendedor extends Funcionario implements Autenticavel{
    private double comissaoMensal;
    private String nivel;
    private String senha;
            
    public Vendedor(String nome, String cpf, double salario, String nivel) {
        super(nome, cpf, salario);
        this.nivel = nivel;
        this.comissaoMensal = 0;
    }

    @Override
    public String getRelatorio() {
        return super.getRelatorio() + "\nÉ um vendedor!";
    }

    @Override
    public double getRendimentoMensal() {
        return super.getRendimentoMensal() + this.comissaoMensal;
    }
    
    public void registrarVenda(double valorVenda){
        this.comissaoMensal += valorVenda*0.10;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
