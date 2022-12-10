package models;
import java.util.ArrayList;

public abstract class Conta {
    private String numero;

    private Credito credito;
    private Debito debito;

    private Cliente cliente;

    private ArrayList<Debito> transfDebito = new ArrayList<Debito>();
    private ArrayList<Credito> transfCredito = new ArrayList<Credito>();

    public void depositar(Double value){

    }

    public void sacar(Double value){

    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
