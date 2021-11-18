package Generics.Test;

abstract class Animal{
    public abstract void consulta();

}
class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
    }
}
class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}
public class WildcardTest {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro() , new Cachorro()};
        Gato[] gatos = {new Gato() , new Gato()};

        consultarAnimais(cachorros);
        consultarAnimais(gatos);
    }
    public static void consultarAnimais(Animal[] animals){
        for (Animal animal : animals){
            animal.consulta();
        }
    }
}
