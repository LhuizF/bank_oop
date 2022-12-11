import models.*;

public class Main4 {
    public static void main(String[] args) {
        Endereco address1 = new Endereco("Rua ABC", "240", "Juiz de Fora", "MG", "36000-000");
        ContaCorrente account1 = new ContaCorrente("2500-75", 50.00);
        Cliente client1 = new Cliente("Gabriella", "96398964512", "32887526974", true, address1, account1);

        account1.depositar(1000.00);

        Endereco address2 = new Endereco("Rua ABC", "240", "Juiz de Fora", "MG", "36000-000");
        ContaPoupanca account2 = new ContaPoupanca("3600-20");
        Cliente client2 = new Cliente("Pedro", "36412595113", "32887526974", true, address2, account2);

        account2.depositar(1000.00);

        account1.transferir(account2, 500.00);

        account1.printConta();
        System.out.println("\n");
        account2.printConta();
    }
}
