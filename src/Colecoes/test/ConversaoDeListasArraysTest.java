package Colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListasArraysTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList();

        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        Integer[] numerosArray = new Integer[numeros.size()];
        numeros.toArray(numerosArray);

        System.out.println(Arrays.toString(numerosArray));
        System.out.println("-------------------------------------------");
        Integer[] numerosArrays2 = new Integer[4];

        numerosArrays2[0] = 10;
        numerosArrays2[1] = 9;
        numerosArrays2[2] = 8;
        numerosArrays2[3] = 7;

        List<Integer> numeros2 = Arrays.asList(numerosArrays2);
        numeros2.set(0,1);
        System.out.println(Arrays.toString(numerosArrays2));
        System.out.println(numeros2);
    }
}
