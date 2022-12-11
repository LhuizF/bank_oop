package models;

public class ContaPoupanca extends Conta {
    private Double rentabilidadeMensal = 0.0;

    public Double calcularSaldo() {
        return this.getSaldo();
    }

    public ContaPoupanca(String numero){
        this.setNumero(numero);
    }

    public void printConta(){
        System.out.print(
            "Conta número: " + this.getNumero() +
            "\nSaldo da conta: " + this.getSaldo() +
            "\nRentabilidade Mensal: " + this.rentabilidadeMensal +
            "\nValor de saque disponivel: " + this.calcularSaldo());
    }
}
