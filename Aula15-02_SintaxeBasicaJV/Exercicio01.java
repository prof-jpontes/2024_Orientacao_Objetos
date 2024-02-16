import java.util.Scanner;
public class Exercicio01{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o nome da pessoa: ");
		String nome = ler.nextLine();
		System.out.print("Ano de nascimento: ");
		int anoNascimento = ler.nextInt();
		System.out.print("Idade em: ");
		int ano = ler.nextInt();
		
		int idade = ano - anoNascimento;
		System.out.println("Nome: "+ nome);
		System.out.println("Idade em "+ ano +": "+idade);
	}
}