package models;
import java.util.ArrayList;

public abstract class Conta {
    private String numero;

    private Cliente cliente;

    private ArrayList<Debito> transfDebito = new ArrayList<Debito>();
    private ArrayList<Credito> transfCredito = new ArrayList<Credito>();


    public String getNumero() {
        return this.numero;
    }

    public void depositar(Double value){
        Credito deposito = new Credito(value);
        this.transfCredito.add(deposito);
    }

    public void sacar(Double value){
        Debito saque = new Debito(value);
        this.transfDebito.add(saque);
    }
    
    public Double getSaldo(){
        return this.getTotalCredito() - this.getTotalDebito();
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getTotalCredito(){
        Double value = 0.0;

        for(Credito credito: this.transfCredito){
            value += credito.getValor();
        }

        return value;
    }

    public Double getTotalDebito(){
        Double value = 0.0;

        for(Debito debito: this.transfDebito){
            value += debito.getValor();
        }

        return value;
    }
}
