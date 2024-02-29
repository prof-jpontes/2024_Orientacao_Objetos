import java.util.*;

public class Lista{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String>nomes = new ArrayList<String>();
		for(int i = 0; i < 10; i++){
			nomes.add(teclado.next());
		}
		System.out.println(nomes);
		System.out.println(nomes.get(5));
		
		for(String n: nomes){
			System.out.println(n);
		}
		for(int i = 0; i < nomes.size(); i++){
			System.out.println(nomes.get(i));
		}
		
	}
}