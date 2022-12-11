import models.*;

public class Main3 {
    public static void main(String[] args) {
        Endereco address = new Endereco("Rua Dos Bobos", "000", "Jota Efe", "MG", "36000-000");
        ContaCorrente account = new ContaCorrente("1000-60", 200.00);
        Cliente client = new Cliente("Mariana", "79945684503", "32987542563", false, address, account);

        account.depositar(100.00);
        account.depositar(100.00);
        account.depositar(100.00);

        account.sacar(50.00);

        account.calcularSaldo();
        account.printSaldo();
    }
}
