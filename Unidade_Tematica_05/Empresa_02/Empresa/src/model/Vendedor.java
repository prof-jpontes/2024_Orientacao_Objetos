package model;

public class Vendedor extends Funcionario {
    private double comissaoMensal;
    private String nivel;
            
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
}
