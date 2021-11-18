package Execicios.classe;

public class Cliente {
    private String nome;
    private String idade;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nome, String idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;

    }

    @Override
    public String toString() {
        return "Cliente" + " Nome: " + nome + " Idade: " + idade + " Endereço: " + endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
