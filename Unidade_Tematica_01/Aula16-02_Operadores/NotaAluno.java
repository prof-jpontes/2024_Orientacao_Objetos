import java.util.Scanner;

public class NotaAluno {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome e a nota do aluno: ");
		String nome = teclado.nextLine();
		double nota = teclado.nextDouble();
		char conceito;
		
		if(nota >= 9) {
			conceito = 'A';
		} else if (nota >= 8) {
			conceito = 'B';
		} else if (nota >= 7) {
			conceito = 'C';
		} else if (nota >= 6) {
			conceito = 'D';
		} else {
			conceito = 'E';
		}
		
		String[] aux = nome.split(" ");
		nome = aux[0] + " " + aux[aux.length -1];
		
		System.out.println("Nome: " + nome + "\nConceito: " + conceito);
		
	}
}