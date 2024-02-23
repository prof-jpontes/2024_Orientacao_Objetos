import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		System.out.println("ESTE PROGRAMA VERIFICA SE UM NUMERO EH PAR OU IMPAR");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Numero: ");
		int num = teclado.nextInt();
		
		/*if(num % 2 == 0) {
				System.out.println("par");
			} else {
				System.out.println("impar");
			}*/
			
		println(num%2 == 0 ? "Par" : "Impar");
	}
	public static void println(String str) {
		System.out.println(str);
	}
}