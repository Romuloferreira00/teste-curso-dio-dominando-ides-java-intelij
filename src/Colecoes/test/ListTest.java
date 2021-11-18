package Colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("romulo");
        nomes.add("ferreira");
        nomes2.add("");

        for (String nome : nomes
             ) {
            System.out.println(nome);
        }

    }
}
