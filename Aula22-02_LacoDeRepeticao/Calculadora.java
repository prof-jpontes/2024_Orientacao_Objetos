import java.util.Scanner;
import java.lang.Math;

public class Calculadora {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
			
		System.out.println("CALCULADORA");
		System.out.println("Deseja iniciar a calculadora(s/n)? ");	
		char opcao = teclado.next().charAt(0);
			
		String menu = "+: soma \n";
		menu += "-: subtracao\n";
		menu += "*: multiplicacao\n";
		menu += "/: divisao\n";
		menu += "%: resto da divisao inteira\n";
		menu += "m: quem eh maior\n";
		menu += "s: sair";
		
		
		loop1:while(opcao == 's') {
			System.out.println("Digite dois numeros inteiros: ");
			int n1 = teclado.nextInt();
			int n2 = teclado.nextInt();
		
			System.out.println("Escolha a operacao: ");
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
					
				case 's':
					System.out.println("Voce escolheu encerrar a calculadora!");
					break loop1;
					
				default:
					System.out.println("Opcao invalida!");
					break;
			}
			System.out.println("Voce deseja fazer outra operacao(s/n)?");
			opcao = teclado.next().charAt(0);
		}
	}
}