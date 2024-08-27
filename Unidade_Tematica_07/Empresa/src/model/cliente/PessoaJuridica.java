package model.cliente;

public class PessoaJuridica extends Cliente {
    
    private String cnpj;
    
    public PessoaJuridica(String nome, String cnpj, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
    }

    @Override
    public String getRelatorio() {
        String relatorio = "DADOS DA EMPRESA\n" +
                "CNPJ: " + this.cnpj + "\n" +
                "RAZÃO SOCIAL: " + this.nome + "\n" + super.getEndereco() + "\n";
        return relatorio;
    }
    
}
