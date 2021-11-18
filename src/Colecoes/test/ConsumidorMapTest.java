package Colecoes.test;

import Colecoes.classes.Consumidor;
import Colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Rômulo", "123");
        Consumidor consumidor2 = new Consumidor("Devdojo", "321");

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 0);
        Produto produto2 = new Produto("321", "Picanha", 46.0, 10);
        Produto produto3 = new Produto("879", "Teclado Rezer", 1000.0, 5);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64Gb", 3250.00, 0);

        Map<Consumidor, List<Produto>> map = new HashMap<>();
        List<Produto> produtoscon1 = new ArrayList<>();

        produtoscon1.add(produto1);
        produtoscon1.add(produto2);

        List<Produto> produtoscon2 = new ArrayList<>();

        produtoscon2.add(produto3);
        produtoscon2.add(produto4);

        map.put(consumidor1, produtoscon1);
        map.put(consumidor2, produtoscon2);

        for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()) {
                System.out.println(produto.getNome());
            }
        }

    }
}
