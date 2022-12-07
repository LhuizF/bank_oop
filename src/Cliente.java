import java.util.ArrayList;

public class Cliente extends Pessoa implements IUsuario{
    private Boolean vip;

    private ArrayList<Endereco> enderecos;
    private ArrayList<Conta> contas;

    public void listarEnderecos(){

    }

    @Override
    public Boolean autenticar() {
        return true;
    }
}
