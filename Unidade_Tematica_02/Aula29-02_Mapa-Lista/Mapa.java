import java.util.*;

public class Mapa {
	public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 HashMap<String, Integer> alunos = new HashMap<String, Integer>();
	 
	 System.out.println("\n\nEste programa cria um Mapa de uma sala");
	 
	 String nome;
	 for (int i=0; i < 5; i++){
		 System.out.print("Nome: ");
		 nome = ler.next();
		 
		 System.out.print("Idade: ");
		 alunos.put(nome, ler.nextInt());
	 }
	System.out.println(alunos);
	for (String k: alunos.keySet()){
		System.out.println(k+ "-" +alunos.get(k));
	}
	for (Integer i: alunos.values()){
		System.out.println(i);
	}
	System.out.println(alunos.get("Lucifer"));
	}
}