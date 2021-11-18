package Jdbc.Test;

import Jdbc.classes.Comprador;
import Jdbc.db.CompradorDB;

public class TestConexao {
    public static void main(String[] args) {
        //deletar();
        //atualizar();
        //inserir();
        //selecionarTudo();
        //selecionarApenasUm(13);
        //CompradorDB.selectMetaData();

    }

    public static void inserir() {
        Comprador comprador = new Comprador(2, "Mario1111", "123,582,467-89");
        CompradorDB.save(comprador);

        CompradorDB compradorDB = new CompradorDB();
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(2);
        CompradorDB.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(1, "mario", "000.000.000-00");
        CompradorDB.update(comprador);
    }

    public static void selecionarTudo() {
        CompradorDB.selectAll();
    }

    public static void selecionarApenasUm(int id) {
        CompradorDB.selectById(id);
    }

}
