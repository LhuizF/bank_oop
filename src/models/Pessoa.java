package models;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String telefone;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() != 11){
            throw new Error("CPF inválido");
        }
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDados(){
        return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nTelefone: " + this.telefone;
    }
}
