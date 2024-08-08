
package model;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario {
    
    private String nivel;
    private double comissaoMensal;
    
    public Vendedor(String nome, String cpf, double salario, String nivel) {
        super(nome, cpf, salario);
        this.nivel = nivel;
        this.comissaoMensal = 0;
    }
    
    public void registrarVenda(double valorVenda){
        this.comissaoMensal += valorVenda*0.1;
    }

    @Override
    public double getRendimentoMensal() {
        return super.getRendimentoMensal() + this.comissaoMensal; 
    }
}
