import java.util.Scanner;

public class Acelerador {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int distancia = ler.nextInt() - 3;
		int aux = distancia%8;
		
		if(aux == 3){
			System.out.println("1");
		} else if (aux == 4) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
	}
}