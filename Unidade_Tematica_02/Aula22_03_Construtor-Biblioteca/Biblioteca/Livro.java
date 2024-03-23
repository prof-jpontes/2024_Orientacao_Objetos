
public class Livro {
	public String isbn;
	public String titulo;
	public String genero;
	public int classificacao;
	public int anoPublicacao;
	public boolean disponivel;
	public Autor autor;

	public Livro(String isbn, String titulo, String genero, int classificacao, Autor autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.genero = genero;
		this.classificacao = classificacao;
		this.autor = autor;

		this.disponivel = true;
	}
	
	public boolean emprestar() {
		if (disponivel) {
			disponivel = false;
			return true;
		}
		return false;
	}
	
	public void devolver() {
		disponivel = true;
	}
	
	public String getRelatorio() {
		String s = "\nISBN: " + this.isbn;
		s += "\nTitulo: " + this.titulo;
		s += "\nAutor: " + this.autor;
		s += "\nDisponivel: " + (this.disponivel ? "Sim" : "Não");

		return s;
	}
}
