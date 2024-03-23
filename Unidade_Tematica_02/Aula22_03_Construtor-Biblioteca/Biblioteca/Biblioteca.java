import java.util.HashMap;

public class Biblioteca {
	public HashMap<String,Livro> acervo = new HashMap<String,Livro>();


	public void adicionar(Livro livro) {
		acervo.put(livro.isbn, livro);
	}
	
	public void remover(Livro livro) {
		acervo.remove(livro.isbn);
	}
	
	public boolean emprestar(Livro livro) {
		return livro.emprestar();
	}
	
	public void devolver(Livro livro) {
		livro.devolver();
	}
	
	public String listar() {
		String s = "\n";
		for (Livro a : acervo.values()) {
			s += a.titulo + " | " + (a.disponivel ? "Disponivel" : "Indisponivel") + "\n";
		}
		return s;
	}
}
