package models;
import interfaces.IUsuario;
import java.util.ArrayList;

public class Cliente extends Pessoa implements IUsuario {
    private Boolean vip;

    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    public void listarEnderecos(){

    }

    @Override
    public Boolean autenticar() {
        return true;
    }
}
