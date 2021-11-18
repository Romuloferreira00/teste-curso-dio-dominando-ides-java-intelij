package Execicios.Test;

import Execicios.classe.Cliente;
import Execicios.classe.Endereco;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.sql.rowset.Joinable;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteTest {
    public static void main(String[] args) {
        List<Cliente> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();

        System.out.println("Nome:");
        cliente.setNome(scanner.next());

        System.out.println("Idade:");
        cliente.setIdade(scanner.next());

        System.out.println("Endereço:");
        endereco.setEnderecoCliente(scanner.next());

        System.out.println("Numero da Casa:");
        endereco.setNumeroCasa(scanner.next());

        cliente.setEndereco(endereco);

        System.out.println("--------------------------------LISTA------------------------------");
        lista.add(cliente);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " " + lista);
        }
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Você deseja continuar a lista: (1)SIM (2)NÃO");
        int resposta = scanner.nextInt();

        switch (resposta) {

            case 1:
                System.out.println("Nome:");
                cliente.setNome(scanner.next());

                System.out.println("Idade:");
                cliente.setIdade(scanner.next());

                System.out.println("Endereço:");
                endereco.setEnderecoCliente(scanner.next());

                System.out.println("Numero da Casa:");
                endereco.setNumeroCasa(scanner.next());

                cliente.setEndereco(endereco);

                System.out.println("--------------------------------LISTA------------------------------");

                lista.add(cliente);
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(i + " " + lista);
                }
                System.out.println("-------------------------------------------------------------------");
                break;
            case 2:
                 System.out.println("Ok muito Obrigado");
                break;
        }

    }

}
