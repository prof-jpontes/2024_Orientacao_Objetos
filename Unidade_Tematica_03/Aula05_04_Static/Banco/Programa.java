import java.util.*;
public class Programa {
    public static void main(String[] args) {
        HashMap<String, Cliente> mapaCliente = new HashMap<String, Cliente>(); //um mapa para guardar os clientes do banco
        HashMap<String, Conta> mapaConta = new HashMap<String, Conta>(); //um mapa para guardar as contas do banco

        Scanner scanner = new Scanner(System.in);
        byte opcao;

        mainloop:do{
            System.out.println("\nESCOLHA UMA DAS SEGUINTES OPÇÕES");
            System.out.println(getMenu()); //mostra o menu
            opcao = Byte.parseByte(scanner.nextLine());
            //opcao = scanner.nextByte(); //estas duas linhas têm o mesmo resultado prático da linha acima
            //scanner.nextLine();

            //decisão de qual ação fazer
           String cpf;
           String nConta;

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de cliente");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String fonte = scanner.nextLine();
                    mapaCliente.put(cpf, new Cliente(nome, cpf, fonte)); //insere no mapa um novo cliente, tendo como chave o CPF e como valor a instância de cliente. Logo, cada valor é uma referência
                    System.out.println("Quantidade de clientes: " + Cliente.getContador());
                    break;
                case 2:
                    System.out.println("Cadastro de conta");
                    System.out.print("Número da agência: ");
                    String agencia = scanner.nextLine();
                    System.out.print("Número da conta: ");
                    nConta = scanner.nextLine();
                    System.out.println("Clientes cadastrados \nCPF - Nome completo");
                    System.out.println(listarClientes(mapaCliente)); //lista todos os clientes já cadastrado, para o atendente saber quem é o dono da conta
                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();
                    System.out.print("Limite: ");
                    double limite = Double.parseDouble(scanner.nextLine());
                    mapaConta.put(nConta, new Conta(agencia, nConta, mapaCliente.get(cpf), limite)); //insere uma nova conta no mapa de contas. Observem que a referência ao cliente dono é obtida do mapa de clientes, com o seu CPF.
                    break;
                case 3:
                    System.out.println("Relatório de uma conta");
                    System.out.print("Número da conta: ");
                    System.out.println(mapaConta.get(scanner.nextLine()).getRelatorio());
                    break;
                case 4:
                    System.out.println(listarClientes(mapaCliente)); 
                    break;
                case 5:
                    System.out.println("Efetuar saque");
                    System.out.print("Número da conta: ");
                    nConta = scanner.nextLine();
                    System.out.print("Valor: ");
                    if (mapaConta.get(nConta).sacar(Double.parseDouble(scanner.nextLine()))) {
                        System.out.println("\nSaque realizado com sucesso!");
                    } else {
                        System.out.println("\nSaldo insuficiente!");
                    }
                    break;
                case 6:
                    System.out.println("Efetuar depósito");
                    System.out.print("Numero da conta:");
                    nConta = scanner.nextLine();
                    System.out.print("Valor: ");
                    mapaConta.get(nConta).depositar(Double.parseDouble(scanner.nextLine()));
                    break;
                case 7:
                    System.out.println("Realizar transferência");
                    System.out.print("Numero da conta de origem: ");
                    nConta = scanner.nextLine();
                    System.out.print("Numero da conta de destino: ");
                    String cDestino = scanner.nextLine();
                    System.out.print("Valor: ");
                    if (mapaConta.get(nConta).transferir(Double.parseDouble(scanner.nextLine()), 
                    mapaConta.get(cDestino))) {
                        System.out.println("Transferencia realizada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 8: 
                    System.out.println("Você escolheu encerrar o sistema");
                    break mainloop; //encerra o do/while
                default:
                    System.err.println("Você escolheu uma opção inválida");
                    break;
            }
        }while(opcao != 8);
    }
    public static String getMenu(){
        String menu = "1. Cadastrar cliente";
        menu += "\n2. Cadastrar conta";
        menu += "\n3. Relatorio de conta";
        menu += "\n4. Listar clientes";
        menu += "\n5. Saque";
        menu += "\n6. Deposito";
        menu += "\n7. Transferencia";
        menu += "\n8. Sair\n";
        return menu;
    }
    public static String listarClientes(HashMap<String, Cliente> m){ //retorna a lista (em string) de todos os dados de nome e CPF dos clientes cadastrados
        String s = "";
        for (String k : m.keySet()) {
            s += k + " - " + m.get(k).getNome() + "\n";
        }
        return s;
    }

}
