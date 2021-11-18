package Execicios.classe;

public class Endereco extends Cliente {
    private String enderecoCliente;
    private String numeroCasa;

    @Override
    public String toString() {
        return enderecoCliente +  ", N: " + numeroCasa;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
}
