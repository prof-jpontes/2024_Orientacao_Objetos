
package model;

public class Gerente extends Funcionario{
    
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getRendimentoMensal() {
        return super.getRendimentoMensal() + 4000; 
    }
    
    
}
