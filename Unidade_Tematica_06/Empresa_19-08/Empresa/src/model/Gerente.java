package model;

public class Gerente extends Funcionario {
    private String setor;
    
    public Gerente(String nome, String cpf, double salario, String setor) {
        super(nome, cpf, salario);
        this.setor = setor;
    }

    @Override
    public String getRelatorio() {
        return super.getRelatorio() + "\nÉ um gerente!";
    }

    @Override
    public double getRendimentoMensal() {
        return super.getRendimentoMensal() + 4000;
    }
    
    
}
