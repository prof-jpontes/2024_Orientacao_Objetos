import java.util.Scanner;

public class Bissexto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		println("ESTE PROGRAMA VERIFICA SE UM ANO EH BISSEXTO!");
		print("Ano: ");
		int ano = teclado.nextInt();
		
		/*String resultado = " Eh bissexto";
		if(ano%4 != 0 || (ano%100 == 0 && ano%400 != 0)){
			resultado = " Nao eh bissexto";
		}
		println(ano + resultado);*/
		
		println(ano%4 != 0 || (ano%100 == 0 && ano%400 != 0) ? ano + " Nao eh bisssexto" : ano + " Eh bisssexto");
		
	}
	public static void println(String str) {
		System.out.println(str);
	}
	public static void print(String str) {
		System.out.print(str);
	}
}