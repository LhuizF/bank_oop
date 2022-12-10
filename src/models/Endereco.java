package models;

public class Endereco {
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Cliente cliente;

    public Endereco(String logradouro, String numero, String cidade, String uf, String cep){
        this.createEndereco(logradouro, numero, cidade, uf, cep);
    }

    public Endereco(String logradouro, String numero, String cidade, String uf, String cep, String complemento){
        this.createEndereco(logradouro, numero, cidade, uf, cep);
        this.complemento = complemento;
    }

    private void createEndereco(String logradouro, String numero, String cidade, String uf, String cep){
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public void printEndereco(){
        String complemento = "";

        if(this.complemento != null){
            complemento = "\ncomplemento: " + this.complemento;
        }

        System.out.print(
                "logradouro: " + this.logradouro +
                "\nnumero: " + this.numero + complemento +
                "\ncidade: " + this.cidade + " - " + this.uf +
                "\nCEP: " + this.cep
        );

        System.out.println("\n");
    }

    private void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
}
