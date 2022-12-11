import models.*;

public class Main2 {
    public static void main(String[] args) {

        Endereco address1 = new Endereco("Rua A", "800", "Cidade J", "RJ", "27000-000");
        Endereco address2 = new Endereco("Rua B", "321", "Cidade T", "MG", "36000-000","APT 401");
        Endereco address3 = new Endereco("Rua C", "960", "Cidade L", "SP", "11000-000", "Bloco A");

        ContaPoupanca account = new ContaPoupanca("1000-9");

        Cliente client = new Cliente("Otávio","98765432112", "32987445658", true, address1, account);

        client.addEndereco(address2);
        client.addEndereco(address3);

        client.listarEnderecos();
    }
}
