package models;
import java.util.ArrayList;

public class Cargo {
    private String nome;

    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Cargo(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
}
