import java.util.*;
import java.lang.Math;

public class CalculadoraMDC{
	public static void main(String[] args){
		System.out.println("Este programa calcula o MDC e MMC de um determinado numero");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Primeiro valor: ");
		int n1 = teclado.nextInt();
		
		System.out.print("Segundo valor: ");
		int n2 = teclado.nextInt();
		
		// MDC - MaXIMO DIVISOR COMUM
		int mdc = 1;
		for(int i = 2; i <= Math.min(n1, n2); i++){
			if (n1%i == 0 && n2%i == 0) mdc = i;
		}
		
		// MMC - Minimo multiplo comum
		int mmc = n1 * n2;
		for (int i = Math.max(n1, n2); i <= (n1 * n2); i++){
			if (i%n1 == 0 && i%n2 == 0){
				mmc = i;
				break;
			} 
		}
		System.out.printf("O MDC e MMC entre %d e %d são, respectivamente, %d e %d %n", n1, n2, mdc, mmc);
	}
	
}