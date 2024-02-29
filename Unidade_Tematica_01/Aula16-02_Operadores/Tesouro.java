import java.util.Scanner;
public class Tesouro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	/*
		int moedas = teclado.nextInt();
		int marinheiros = teclado.nextInt();
		int aux = moedas / (marinheiros + 2);
		
		System.out.println(aux * 2);
	*/
	
		System.out.println(2 * (teclado.nextInt()/(teclado.nextInt() + 2)));

	}
}