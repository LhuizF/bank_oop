package models;
import interfaces.IUsuario;
import java.util.ArrayList;
import java.util.Arrays;

public class Funcionario extends Pessoa implements IUsuario {
    private Double salario;
    private ArrayList<Cargo> cargos = new ArrayList<Cargo>();

    public Funcionario(String nome, String cpf, String telefone, Double salario, Cargo cargo){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.salario = salario;

        cargo.addFuncionario(this);
        this.cargos.add(cargo);
    }

    @Override
    public Boolean autenticar() {
        return true;
    }

    public void addCargo(Cargo cargo){
        this.cargos.add(cargo);
    }

    public String toString(){
        String dadosPessoa = this.getDados();
        String cargos = "\nCargo(s):";
        String space = " ";

        for(int i = 0; i < this.cargos.size(); i++){
            Cargo c = this.cargos.get(i);

            if(i > 0){
                space = ", ";
            }
            
            cargos = cargos + space + c.getNome();
        }

        return dadosPessoa + "\nSalario: " + this.salario + cargos;
    }
}
