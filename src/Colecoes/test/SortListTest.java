package Colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Rômulo");
        nomes.add("Ferreira");
        nomes.add("Cardoso");
        nomes.add(0,"Rafa");
        nomes.add(0,"Sofia");

        Collections.sort(nomes);

        List<Double> numeros = new ArrayList<>();
        numeros.add(1.0);
        numeros.add(1.5);
        numeros.add(1.4);
        numeros.add(1.9);

        Collections.sort(numeros);

        for (String nome : nomes){
            System.out.println(nome);

        }

        for (double numero : numeros){
            System.out.println(numero);
        }
    }
}
