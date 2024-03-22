public class Conta {
	// Atributos
	public String numeroAgencia;
	public String numeroConta;
	public Cliente titular;
	public double saldo;
	public double limite;

	// Construtor
	public Conta(String numeroAgencia, String numeroConta, Cliente titular){
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 100;
		this.limite = 0;
	}

	public boolean transferir(double valor, Conta destino) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor * 1.005) {
			this.saldo -= valor * 1.005;
			return true;
		}
		return false;
	}
	
	public boolean investir(double valor, String tipo) {
		if (this.sacar(valor)) return true;
		return false;
	}

	
	public String getRelatorio() {
		String s = "\nAgencia: "+ this.numeroAgencia;
		s += "\nConta: "+ this.numeroConta;
		s += "\nDados do titular: "+ this.titular.getRelatorio(); 
		s += "\nSaldo: R$ "+ String.format("%.2f", this.saldo)  + "\n";
		return s;
	}
}
