package Colecoes.test;

import Colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProdutoNomeComparetor implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.00);
        Produto produto2 = new Produto("321", "Picanha", 46.0);
        Produto produto3 = new Produto("879", "Teclado Rezer", 1000.0);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64Gb", 3250.00);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        Collections.sort(produtos, new ProdutoNomeComparetor());

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
