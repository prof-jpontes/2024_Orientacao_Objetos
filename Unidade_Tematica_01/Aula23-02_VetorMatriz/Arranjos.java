import java.util.*;

public class Arranjos{
	public static void main(String[] args){
		System.out.println("Neste programa iremos aprender sobre Matrizes e Vetores");
		// declarando um vetor de tam 10
		int[] vetor = new int[10];
		
		Random gerador = new Random();
		for(int i = 0; i < 10; i++){
			vetor[i] = gerador.nextInt(100);
		}
		
		Arrays.sort(vetor);
		
		for(int i = 0; i < vetor.length; i++){
			System.out.println(vetor[i]+" ");
		}
		// matrizes
		int [][] matriz = new int[5][10];
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 10; j++){
				matriz[i][j] = gerador.nextInt(100);
			}
		}
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[0].length; j++){
				System.out.printf("%3d", matriz[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < vetor.length; i++){
			int contador = 0;
			for(int j = 0; j < matriz.length; j++){
				for(int k = 0; k < matriz[0].length; k++){
					if(vetor[i] == matriz[j][k]){
						contador++;
					}
				}
			}
			System.out.println(vetor[i] + " -> " + contador);
		}
		
	}
}