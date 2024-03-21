public class Programa {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        conta1.numeroAgencia = "123";
        conta1.numeroConta = "1234";
        conta1.nomeTitular = "Jonas";
        conta1.saldo = 10;
        conta2.numeroAgencia = "123";
        conta2.numeroConta = "5678";
        conta2.nomeTitular = "Carol";
        conta2.saldo = 1000;
        /*
        System.out.println(conta1.getRelatorio());
        System.out.println(conta2.getRelatorio());
        conta1.sacar(6);
        System.out.println(conta1.getRelatorio());
        conta2.transferir(500, conta1);
        System.out.println("apos transferencia: ");
        System.out.println(conta1.getRelatorio());
        System.out.println(conta2.getRelatorio());
        */
        Conta conta3 = new Conta();
        System.out.println(conta3.getRelatorio());
    }

}