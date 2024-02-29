import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		System.out.println("ESTE PROGRAMA IDENTIFICA SE UM NUMERO EH PRIMO!");
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Numero: ");
		int num = ler.nextInt();
		String resultado = " Nao eh primo";
		
		if(num > 1) {
			int contador = 0;
			for(int i = 1; i <= num; i++) {
				if(num%i == 0) 
					contador++;
			}
			if(contador == 2) {
				resultado = " Eh primo";
			}
		}
		System.out.println(num + resultado);
	}
}