package controller;

import java.util.HashMap;
import java.util.Map;
import model.cliente.Cliente;
import model.cliente.PessoaFisica;
import model.cliente.PessoaJuridica;

public class ControleCliente {
    Map<String, Cliente> clientes = new HashMap<>();
    
public boolean cadastrarCliente(String nome, String doc, String telefone, String tipo) {
    if (clientes.get(doc) == null) {
        if (tipo.equals("pf")) {
            clientes.put(doc, new PessoaFisica(nome, doc, telefone));
        } else {
            clientes.put(doc, new PessoaJuridica(nome, doc, telefone));
        }
        return true;
    }
    return false;
}

public boolean cadastrarCliente(String nome, String doc, String telefone, String endereco, String tipo) {
    if (this.cadastrarCliente(nome, doc, telefone, tipo)) {
        clientes.get(doc).setEndereco(endereco);
        return true;
    }
    return false;
}

public String getRelatorioTodosClientes() {
    String relatorio = "\n";
    
    for (Cliente c : clientes.values()) {
        relatorio += c.getRelatorio() + "\n\n";
    }
    
    return relatorio;
}

public String getRelatorioUmCliente(String chave){
    if(this.clientes.get(chave) != null){
        return this.clientes.get(chave).getRelatorio();
    }
    return "Cliente não localizado pelo documento";
}
    
}
