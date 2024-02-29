import java.util.*;

public class Fibonacci{
	public static void main(String[] args){
		System.out.println("Este programa mostra a sequencia Fibonacci ate passar de um numero escolhido por vc");
		int atual = 1;
		int anterior = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o numero: ");
		int n = teclado.nextInt();
		
		if (n == 1) System.out.print("0.");
		else if (n == 2) System.out.print("0, 1.");
		else {
			do{
				atual = atual + anterior;
				anterior = atual - anterior;
				System.out.print(atual + (atual > n ? "." : ", "));
			}while(atual <= n);
		}
		
	}
	
}