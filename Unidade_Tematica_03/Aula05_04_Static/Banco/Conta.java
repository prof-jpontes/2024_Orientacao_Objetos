public class Conta {
	// Atributos
	private String numeroAgencia;
	private String numeroConta;
	private Cliente titular;
	private double saldo;
	private double limite;

	// Construtor
	public Conta(String numeroAgencia, String numeroConta, Cliente titular){
		this.inicializar(numeroAgencia, numeroConta, titular);
	}

	// Construtor 2
	public Conta(String numeroAgencia, String numeroConta, Cliente titular, double limite) {
		this.inicializar(numeroAgencia, numeroConta, titular);
		this.limite = limite;
	}

	// Metoto inicializar
	private void inicializar(String numeroAgencia, String numeroConta, Cliente titular) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 100;
		this.limite = 0;
	}

	// Metodo "Acessador"/get
	public String getNumeroConta() {
		return this.numeroConta;
	}

	// Metodo "Acessador"/get
	public double getSaldo() {
		return this.saldo;
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
		s += "\nSaldo: R$ "+ String.format("%.2f", this.saldo);
		s += "\nLimite: " + String.format("%.2f", this.limite) + "\n";
		return s;
	}
}
