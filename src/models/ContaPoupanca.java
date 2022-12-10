package models;

public class ContaPoupanca extends Conta {
    private Double rentabilidadeMensal;

    public Double calcularSaldo() {
        return 0.0;
    }

    public ContaPoupanca(String numero){
        this.setNumero(numero);
    }
}
