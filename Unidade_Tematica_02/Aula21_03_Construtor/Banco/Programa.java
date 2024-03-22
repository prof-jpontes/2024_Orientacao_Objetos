import java.util.*;
public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte opcao;
        do{
            System.out.println("Escolha um das seguintes opcoes");
            // opcao = Byte.parseByte(scanner.nextLine());
            opcao = scanner.nextByte();
            scanner.nextLine();
        }while(opcao != 5);

        Cliente titular1 = new Cliente("Davi","58223669210", "6894012268");
        Cliente titular2 = new Cliente("Carol", "88877722200", "68984015522");

        Conta conta1 = new Conta("123", "1234", titular1);
        Conta conta2 = new Conta("123", "5678", titular2);
        
        System.out.println(conta1.getRelatorio());
        System.out.println(conta2.getRelatorio());
        conta1.sacar(6);
        System.out.println(conta1.getRelatorio());
        conta2.transferir(500, conta1);
        System.out.println("apos transferencia: ");
        System.out.println(conta1.getRelatorio());
        System.out.println(conta2.getRelatorio());
    }
    public static String getMenu(){
        String menu = "\n1. Cadastrar cliente";
        menu += "\n2. Cadastrar conta";
        menu += "\n3. Relatorio de conta";
        menu += "\n4. Listar clientes";
        menu += "\n5. Sair\n";
        return menu;
    }

}