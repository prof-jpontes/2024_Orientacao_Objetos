import java.util.*;
import java.lang.Math;

public class Fazenda{
	public static void main(String[] args){
		System.out.println("este programa calcula a massa de bois de uma fazenda");
		Scanner teclado = new Scanner(System.in);
		ArrayList<Double> bois = new ArrayList<Double>();
		
		System.out.print("Insira a massa: ");
		
		double massa = teclado.nextDouble();
		double maisLeve = massa;
		double maisPesado = massa;
		double soma = 0;
		int contador = 0;
		
		while(massa > 0){
			soma+= massa;
			contador++;
			bois.add(massa);
			
			if(massa < maisLeve) maisLeve = massa;
			else if (massa > maisPesado) maisPesado = massa; 
			System.out.print("Insira a massa: ");
			massa = teclado.nextDouble();
			
		}
		System.out.println("Mais pesado: "+maisPesado);
		System.out.println("Mais leve: "+maisLeve);
		System.out.println("Quantidade de animais: "+contador);
		System.out.println("Media: "+soma / contador);
		
		double media = soma/contador;
		double somatorio = 0;
		
		for (Double i: bois) {
			somatorio += (i - media) * (i - media);
		}
		
		double variancia = somatorio / contador;
		double desvioPadrao = Math.sqrt(variancia);
		System.out.println("Variancia: " +variancia);
		System.out.println("Desvio Padrao: " +desvioPadrao);
	}	
}