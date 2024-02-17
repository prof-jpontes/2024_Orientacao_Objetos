import java.util.Scanner;
import java.lang.Math;

public class Soma {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		int maior = Math.max(n1, n2);
		int menor = Math.min(n1, n2);
		int soma = 0;
		
		for(int i = menor; i <= maior; i++) {
			soma += i;
		}
		
		System.out.println("O valor da soma eh: " + soma);
	}
}