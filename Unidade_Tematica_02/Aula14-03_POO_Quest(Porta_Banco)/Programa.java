public class Programa {
	public static void main(String[] args){
		Porta porta = new Porta(); 
		Porta porta2 = new Porta();
	
		porta.comprimento = 210;
		porta.largura = 100;
		porta.espessura = 10;
		porta.material = "Madeira";
		porta.cor = "Rosa";
		porta.tipoAbertura = "Rotativo";
		porta.chave = "1234";
		
		System.out.println(porta.mostrarRelatorio());

		System.out.println(porta.trancar("1034") ? "A porta foi trancada" : "Chave incorreta");
		System.out.println(porta.mostrarRelatorio());

		porta.fechar();
		System.out.println(porta.mostrarRelatorio());
	}
}