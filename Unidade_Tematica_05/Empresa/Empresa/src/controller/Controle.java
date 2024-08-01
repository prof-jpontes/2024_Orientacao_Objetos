package controller;

import java.util.HashMap;
import java.util.Map;
import model.Funcionario;
import model.Gerente;
import model.Vendedor;

public class Controle {
    Map<String, Funcionario> funcionarios =
            new HashMap<String, Funcionario>();
    
    public void cadastrarFuncionario(String nome, String cpf, double salario) {
        funcionarios.put(cpf, new Funcionario(nome, cpf, salario));
    }
    
    public void cadastrarVendedor(String nome, String cpf, double salario, String nivel) {
        funcionarios.put(cpf, new Vendedor(nome, cpf, salario, nivel));
    }
    
    public void cadastrarGerente(String nome, String cpf, double salario, String setor) {
        funcionarios.put(cpf, new Gerente(nome, cpf, salario, setor));
    }
    
    public String getRelatorioFuncionarios() {
        String relatorio = "";
        for (Funcionario f : funcionarios.values()) {
            relatorio += f.getRelatorio() + "\n================";
        }
        return relatorio;
    }
    
    public String vender(String cpf, double valorProduto){
        if(this.funcionarios.get(cpf) instanceof Vendedor){
            Vendedor v = (Vendedor)this.funcionarios.get(cpf);
            v.registrarVenda(valorProduto);
            //outras ações aqui
            return "Venda registrada";
        }
        
        return "Venda não registrada";
    }
}
