package models;
import interfaces.IUsuario;
import java.util.ArrayList;

public class Cliente extends Pessoa implements IUsuario {
    private Boolean vip;

    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    public Cliente(String nome, String cpf, String telefone, Boolean isVip, Endereco endereco, Conta conta){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.vip = isVip;

        endereco.setCliente(this);
        this.addEndereco(endereco);

        conta.setCliente(this);
        this.addConta(conta);
    }

    public void listarEnderecos(){
        System.out.println("Listando enderecos do cliente: " + this.getNome() + "\n");
        for (Endereco endereco: this.enderecos) {
            endereco.printEndereco();
        }
    }

    @Override
    public Boolean autenticar() {
        return true;
    }

    public void addEndereco(Endereco endereco){
        endereco.setCliente(this);
        this.enderecos.add(endereco);
    }

    public void addConta(Conta conta){
        this.contas.add(conta);
    }
}
