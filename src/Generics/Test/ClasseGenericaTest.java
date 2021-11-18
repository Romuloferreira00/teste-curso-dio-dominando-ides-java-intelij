package Generics.Test;

import Generics.Classes.Carro;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o Carro por um mês");
        carroAlugavel.devolverCarro(carroAlugado);

    }
}

class CarroAlugavel {
    private List<Carro> carrosDinsponiveis = new ArrayList<>();

    {
        carrosDinsponiveis.add(new Carro("GOL"));
        carrosDinsponiveis.add(new Carro("BMW"));
    }
    public Carro getCarroDisponivel(){
        Carro c = carrosDinsponiveis.remove(0);
        System.out.println("Alugando Carros: "+c);
        System.out.println("Carros Disponiveis: "+carrosDinsponiveis);

        return c;
    }
    public void devolverCarro(Carro c){
        System.out.println("Devolvendo Carro: "+c);
        carrosDinsponiveis.add(c);
        System.out.println("Carros Disponiveis: "+carrosDinsponiveis);
    }
}