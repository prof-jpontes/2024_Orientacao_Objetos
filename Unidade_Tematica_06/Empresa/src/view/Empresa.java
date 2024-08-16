package view;

import controller.ControleFuncionario;
import controller.ControleCliente;
import javax.swing.JOptionPane;
import model.cliente.Cliente;
import model.cliente.PessoaFisica;
import model.cliente.PessoaJuridica;
import model.funcionario.Funcionario;
import model.funcionario.Gerente;
import model.funcionario.Vendedor;

public class Empresa {

    public static void main(String[] args) {
        ControleFuncionario controle = new ControleFuncionario();
        
        /*controle.cadastrarFuncionario("Jonas", "11111111111", 1000);
        controle.cadastrarFuncionario("Joselito", "22222222222", 1000);
        controle.cadastrarVendedor("Fausto", "33333333333", 1000, "Junior");
        controle.cadastrarGerente("Bruno", "44444444444", 1000, "Comercial");
        System.out.println(controle.vender("33333333333", 1000));
        System.out.println(controle.vender("33333333333", 10000));
        System.out.println(controle.vender("33333333333", 20000));
        
        String str = 
        controle.vender("33333333333", 20000);
        JOptionPane.showMessageDialog(null, str);
        
        System.out.println(controle.getRelatorioTodosFuncionarios());*/
        
        ControleCliente controleCliente = new ControleCliente();
        
        controleCliente.cadastrarCliente("Gilmar", "11111111111", "68999547852", "pf");
        controleCliente.cadastrarCliente("Joao", "22222222222", "6899965412", "Rua do Jambo, 50","pf");
        controleCliente.cadastrarCliente("José Eventos", "3333333333", "6832234567", "Rua da Carambola, 10","pj");
        System.out.println(controleCliente.getRelatorioTodosClientes());
                
    }
    
}
