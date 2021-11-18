package Colecoes.test;

import Colecoes.classes.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 0);
        Produto produto2 = new Produto("321", "Picanha", 46.0, 10);
        Produto produto3 = new Produto("879", "Teclado Rezer", 1000.0, 5);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64Gb", 3250.00, 0);

        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);

        for(Produto produto : produtoNavigableSet){
            System.out.println(produto  );
        }
        System.out.println("----------------------------------");

        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollFirst());
        System.out.println(produtoNavigableSet.lower(produto4));

    }
}
