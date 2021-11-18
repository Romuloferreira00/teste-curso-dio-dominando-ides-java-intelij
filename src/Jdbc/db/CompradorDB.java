package Jdbc.db;

import Jdbc.Conn.ConexaoFactory;
import Jdbc.classes.Comprador;

import java.sql.*;

public class CompradorDB {
    public static void save(Comprador comprador) {
        String sql = "INSERT INTO comprador(nome, cpf) VALUES ('" + comprador.getNome() + "','" + comprador.getCpf() + "');";
        Connection conn = ConexaoFactory.getConexao();
        try {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro incluido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel excluir o registro");
            return;
        }
        String sql = "DELETE FROM comprador WHERE (`id` = '" + comprador.getId() + "');\n";
        Connection conn = ConexaoFactory.getConexao();
        try {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro excluido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE comprador SET cpf = '" + comprador.getCpf() + "', `nome` = '" + comprador.getNome() + "' WHERE (`id` = '" + comprador.getId() + "');";
        Connection conn = ConexaoFactory.getConexao();
        try {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro atualizado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectAll() {
        String sql = "SELECT * FROM agencia.comprador;";
        Connection conn = ConexaoFactory.getConexao();
        try {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("cpf"));

            }
            ConexaoFactory.close(conn, stmt, rs);
            ConexaoFactory.close(conn, stmt);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectById(int id) {
        String sql = "SELECT * FROM agencia.comprador where id=" + id;
        Connection conn = ConexaoFactory.getConexao();
        try {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.first()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("cpf"));

            }
            ConexaoFactory.close(conn, stmt, rs);
            ConexaoFactory.close(conn, stmt);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectMetaData() {
        String sql = "SELECT * FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();


        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();

            int qtColulas = rsmd.getColumnCount();
            System.out.println("Qunatidade coluna: " + qtColulas);
            for (int i = 1; i <= qtColulas; i++) {
                System.out.println("Tabela: " + rsmd.getTableName(i));
                System.out.println("Nome coluna: " + rsmd.getColumnName(i));
                System.out.println("Tamanho coluna: " + rsmd.getColumnDisplaySize(i));

            }

            ConexaoFactory.close(conn, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
