
public class Autor {
	public String nome;
	public String escolaLiteraria;
	public String nacionalidade;
	public int qtdLivros;

	public Autor(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	public Autor(String nome, String escolaLiteraria, String nacionalidade, int qtdLivros) {
		this.nome = nome;
		this.escolaLiteraria = escolaLiteraria;
		this.nacionalidade = nacionalidade;
		this.qtdLivros = qtdLivros;
	}
	
	public String getRelatorio() {
		String s = "\nNome: " + this.nome;
		s += "Escola Literaria: " + this.escolaLiteraria;
		s += "Nacionalidade: " + this.nacionalidade;
		s += "Quantidade de Livros Publicados: " + this.qtdLivros;
		return s;
	}

}
