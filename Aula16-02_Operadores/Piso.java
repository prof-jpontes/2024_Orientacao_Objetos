import java.util.Scanner;
public class Piso {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int largura = teclado.nextInt();
		int comprimento = teclado.nextInt();
		int tipo2 = 2 * ((comprimento - 1) + (largura - 1));		
		int tipo1 = (comprimento * largura) +  (comprimento - 1) * (largura - 1); 
		
		System.out.println(tipo1 + "\n" + tipo2);
	
	}	
}