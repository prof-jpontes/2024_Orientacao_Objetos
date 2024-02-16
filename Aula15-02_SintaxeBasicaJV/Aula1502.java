/*Esta é uma aula de sintaxe básica do Java*/
import java.util.Scanner;
public class Aula1502{
	public static void main(String[] args){
		int n1, n2, resultado;
		Scanner teclado = new Scanner(System.in);
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		resultado = n1 + n2;
		System.out.println("A soma de "+ n1 +" com "+ n2 +" e igual a "+ resultado);
		
		resultado = n1 - n2;
		System.out.println("A subtracao de "+ n1 +" por "+ n2 +" e igual a "+ resultado);
		
		resultado = n1 * n2;
		System.out.println("O produto de "+ n1 +" com "+ n2 +" e igual a "+ resultado);
		
		double divisao = (double)n1/n2;
		System.out.println("A divisao de "+ n1 +" por "+ n2 +" e igual a "+ divisao);
		
	}
}	

/*
Operadores: - + * / % 

Caractere
		char a = 'a';
Tamanho:16 bits

Inteiro
		int i = teclado.nextInt();
Tamanho:32 bits
		short s = teclado.nextShort();
Tamanho:16 bits	
		byte b = teclado.nextByte();
Tamanho:8 bits
		long l = teclado.nextLong();
Tamanho:64 bits

Ponto Flutuante
		float f = teclado.nextFloat();
Tamanho:32 bits
		double d = teclado.nextDouble();
Tamanho:64 bits

Logico
		boolean b = teclado.nextBoolean();
Tamanho:1 bits -> true / false

texto
	String str = "texto";
	String str = teclado.next();
	String str = teclado.nextLine();
*/