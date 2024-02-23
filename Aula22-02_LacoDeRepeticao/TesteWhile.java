import java.util.Scanner;

public class TesteWhile {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("ESTE PROGRAMA LER NUMEROS INTEIROS ATE ENCONTRAR UM VALOR NEGATIVO OU 0");
		
		int num, soma = 0;
		do {
			System.out.print("Numero: ");
			num = ler.nextInt();
			soma += num > 0 ? num : 0;
			// soma += num;
		} while(num > 0);
		System.out.println("Soma: "+ soma);
		// System.out.println("Soma: "+ (soma - num));
	}
}