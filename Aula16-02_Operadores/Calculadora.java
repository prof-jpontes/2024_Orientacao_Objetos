import java.util.Scanner;
import java.lang.Math;

public class Calculadora {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
			
		System.out.println("Digite dois numeros inteiros: ");
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		
		System.out.println("Escolha a operacao: ");
		String menu = "+: soma \n";
		menu += "-: subtracao\n";
		menu += "*: multiplicacao\n";
		menu += "/: divisao\n";
		menu += "%: resto da divisao inteira\n";
		menu += "m: quem eh maior\n";
		
		System.out.println(menu);
		
		char op = teclado.next().charAt(0);
		
		switch (op) {
			case '+': 
				System.out.println("Soma: " + (n1 + n2));
				break;
			
			case '-':
				System.out.println("Substracao: " + (n1 - n2));
				break;
			
			case '*':
				System.out.println("Multiplicacao: " + (n1 * n2));
				break;
				
			case '/':
				System.out.println("Divisao: " + ((double)n1 / n2));
				break;
				
			case '%': 
				System.out.println("Resto de divisao inteira: " + (n1 % n2));
				break;
				
			case 'm':
				System.out.println("Numero maior: " + (Math.max(n1, n2)));
				break;
				
			default:
				System.out.println("Opcao invalida!");
				break;
		}
			
	}
}