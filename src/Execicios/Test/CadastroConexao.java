package Execicios.Test;

import Execicios.classe.Cadastro;
import Execicios.classe.CadastroDB;
import java.util.Scanner;

public class CadastroConexao {
    public static void main(String[] args) {

        makingRegistrations();
        resposta();


    }

    public static void inserir(Cadastro cadastro) {
        CadastroDB cadastroDB = new CadastroDB();
        cadastroDB.save(cadastro);
    }

    public static void deletar(Cadastro cadastro) {
        CadastroDB cadastroDB = new CadastroDB();
        cadastroDB.delete(cadastro);
    }

    public static void selecionarTudo() {
        CadastroDB cadastroDB = new CadastroDB();
        cadastroDB.selectAll();
    }

    public static void selecionarApenasUm(Cadastro cadastro) {
        CadastroDB cadastroDB = new CadastroDB();
        cadastroDB.selectById(cadastro);
    }

    public static void fazerCadastro() {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu NOME: ");
        cadastro.setNome(scanner.next());

        System.out.println("Digite sua IDADE:");
        cadastro.setIdade(scanner.nextInt());

        System.out.println("Digite seu CPF:");
        cadastro.setCpf(scanner.next());

        System.out.println("Digite seu ENDEREÇO:");
        cadastro.setEnderco(scanner.next());
    }

    public static void makingRegistrations() {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===O QUE VOCÊ DESEJA?===");
        System.out.println("(1)FAZER CADASTRO: (2)VER CADASTROS (3)ATUALIZAR CADASTRO (4)DELETAR CADASTRO (5)PROCURAR UM CADASTRO");
        int resposta = scanner.nextInt();

        switch (resposta) {
            case 1:
                fazerCadastro();
                inserir(cadastro);

                break;

            case 2:
                selecionarTudo();

                break;

            case 3:

                selecionarTudo();
                System.out.println("Digite o ID:");
                cadastro.setId(scanner.nextInt());
                fazerCadastro();

                break;

            case 4:
                selecionarTudo();
                System.out.println("Digite o ID");
                cadastro.setId(scanner.nextInt());
                deletar(cadastro);
                break;

            case 5:
                System.out.println("Qual o ID?");
                cadastro.setId(scanner.nextInt());
                selecionarApenasUm(cadastro);
                break;

        }
    }

    public static void resposta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você quer continuar?");
        System.out.println("(1)SIM (2)NÂO");
        int resposta = scanner.nextInt();

        switch (resposta) {
            case 1:
                makingRegistrations();
                break;

            case 2:
                System.out.println("Ok muito obrigado!");
                break;
        }

    }

}
