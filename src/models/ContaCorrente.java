package models;

public class ContaCorrente extends Conta {
    private Double limite;

    public ContaCorrente(String numero, Double limite){
        this.setNumero(numero);
        this.limite = limite;
    }

    public void transferir(Conta contaDestino, Double valor){
        if(valor > this.calcularSaldo()){
            System.out.println("Saldo insuficiente");
            this.printConta();
        } else {
            super.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public Double calcularSaldo(){
        return this.getSaldo() + + this.limite;
    }

    public void sacar(Double saque){
        Double saqueDispovivel = this.calcularSaldo();

        if(saque > saqueDispovivel){
            System.out.println("Saldo insuficiente");
            this.printConta();
        } else {
            super.sacar(saque);
        }
    }

    public void printConta(){
        System.out.print(
            "Conta número: " + this.getNumero() +
            "\nSaldo da conta: " + this.getSaldo() +
            "\nLimite disponivel: " + this.limite +
            "\nValor de saque disponivel: " + this.calcularSaldo());
    }
}
