// Classe Porta
public class Porta {
	
	// Atributos
	public double comprimento;
	public double largura;
	public double espessura;
	public String material;
	public String tipoAbertura;
	public boolean fechada = false;
	public boolean trancada = false;
	public String chave;
	public String cor;
	
	// Metodos
	public boolean abrir() {
		if (!trancada){
			fechada = false;
			return true;
		}
		return false;
	}
	
	public void fechar() {
		this.fechada = true;
	}
	
	public boolean trancar(String chave) {
		if (chave.equals(this.chave)){
			fechar();
			trancada = true;
			return true;
		}
		return false;
	}
	
	public boolean destrancar(String chave) {
		if (chave.equals(this.chave)){
			trancada = false;
			return true;
		}
		return false;
	}
	
	// Metodo para retornar os valors de alguns atributos
	public String mostrarRelatorio() {
		String s = "\nComprimento: " + this.comprimento;
		s += "\nLargura: " + this.largura;
		s += "\nCor: " + this.cor;
		s += "\nFechada: " + this.fechada;
		s += "\nTrancada: " + this.trancada;
		return s;
	}
}
