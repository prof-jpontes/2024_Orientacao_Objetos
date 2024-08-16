package controller;

import java.util.HashMap;
import java.util.Map;
import model.funcionario.Funcionario;
import model.funcionario.Gerente;
import model.funcionario.Vendedor;

public class ControleFuncionario {
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
    
    public String getRelatorioTodosFuncionarios() {
        String relatorio = "";
        for (Funcionario f : funcionarios.values()) {
            relatorio += f.getRelatorio() + "\n================";
        }
        return relatorio;
    }
    
    public String getRelatorioFuncionario(String cpf) {
        return this.funcionarios.get(cpf).getRelatorio();
}
    
    public String[] getCpfFuncionarios() {
        String[] cpfs = new String[this.funcionarios.size() + 1];
        cpfs[0] = "Todos";
        int i = 1;
        for (String s : this.funcionarios.keySet()) {
            cpfs[i++] = s + " - " + this.funcionarios.get(s).getNome();
        }
        return cpfs;
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
