import java.util.ArrayList;

public class Funcionario extends Pessoa implements IUsuario {
    private Double salario;
    private ArrayList<Cargo> cargos;

    @Override
    public Boolean autenticar() {
        return true;
    }
}
