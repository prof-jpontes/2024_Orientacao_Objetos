package view;

import controller.Controle;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Gerente;
import model.Vendedor;

public class Empresa {

    public static void main(String[] args) {
        Controle controle = new Controle();
        
        controle.cadastrarFuncionario("Jonas", "11111111111", 1000);
        controle.cadastrarFuncionario("Joselito", "22222222222", 1000);
        controle.cadastrarVendedor("Fausto", "33333333333", 1000, "Junior");
        controle.cadastrarGerente("Bruno", "44444444444", 1000, "Comercial");
        System.out.println(controle.vender("33333333333", 1000));
        System.out.println(controle.vender("33333333333", 10000));
        System.out.println(controle.vender("33333333333", 20000));
        
        String str = 
        controle.vender("33333333333", 20000);
        JOptionPane.showMessageDialog(null, str);
        
        System.out.println(controle.getRelatorioTodosFuncionarios());
    }
    
}
