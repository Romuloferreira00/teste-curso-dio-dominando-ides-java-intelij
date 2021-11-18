package Colecoes.test;

import Colecoes.classes.Produto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 0);
        Produto produto2 = new Produto("321", "Picanha", 46.0, 10);
        Produto produto3 = new Produto("879", "Teclado Rezer", 1000.0, 5);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64Gb", 3250.00, 0);

        Set<Produto> produtoSet = new LinkedHashSet<>();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);

        for (Produto p : produtoSet){
            System.out.println(p);
        }

    }
}
