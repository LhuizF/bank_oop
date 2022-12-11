package models;

public class ContaCorrente extends Conta {
    private Double limite;

    public ContaCorrente(String numero, Double limite){
        this.setNumero(numero);
        this.limite = limite;
    }

    public void transferir(Conta contaDestino, Double valor){

    }

    public Double getSaldo(){
      return this.getTotalCredito() - this.getTotalDebito();
    }

    public Double calcularSaldo(){
        return this.getSaldo() + + this.limite;
    }

    public void sacar(Double saque){
        Double saldo = this.getSaldo();
        Double saqueDispovivel = this.calcularSaldo();

        if(saque > saqueDispovivel){
            System.out.println("Saldo insuficiente");
            System.out.print("Saldo da conta: " + saldo + "\nLimite disponivel: " + this.limite + "\nValor de saque disponivel: " + saqueDispovivel);
        } else {
            super.sacar(saque);
        }
    }

    public void printSaldo(){
        System.out.print(
                "Conta número: " + this.getNumero() +
                "\nSaldo da conta: " + this.getSaldo() +
                "\nLimite disponivel: " + this.limite +
                "\nValor de saque disponivel: " + this.calcularSaldo());
    }
}
