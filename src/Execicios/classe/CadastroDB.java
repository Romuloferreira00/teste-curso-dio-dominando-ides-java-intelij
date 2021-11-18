package Execicios.classe;

import Jdbc.Conn.ConexaoFactory;

import java.sql.*;

public class CadastroDB {
    public void save(Cadastro cliente) {
        String sql = "INSERT INTO cadastro.cliente(nome, idade, cpf, endereco) VALUES ('" + cliente.getNome() + "','" + cliente.getIdade() + "','"+ cliente.getCpf() + "','"+ cliente.getEnderco() +"');";
        Connection conn = ConexaoFactory.getConexaoCadastral();
        try {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro incluido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Cadastro cliente) {
        if (cliente == null || cliente.getId() == null) {
            System.out.println("Não foi possivel excluir o registro");
            return;
        }
        String sql = "DELETE FROM cadastro.cliente WHERE (`id` = '" + cliente.getId() + "');\n";
        Connection conn = ConexaoFactory.getConexaoCadastral();
        try {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro excluido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Cadastro cliente) {
        if (cliente == null || cliente.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE cliente SET nome = '" + cliente.getNome() + "',idade = '" + cliente.getIdade() + "',cpf = '" + cliente.getCpf() + "',endereco = '" + cliente.getEnderco() + "' WHERE (id = '" + cliente.getId() + "');";
        Connection conn = ConexaoFactory.getConexaoCadastral();
        try {

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro atualizado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectAll() {
        String sql = "SELECT * FROM cadastro.cliente;";
        Connection conn = ConexaoFactory.getConexaoCadastral();
        try {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("ID: "+ rs.getInt("id"));
                System.out.println("NOME: "+ rs.getString("nome"));
                System.out.println("IDADE:"  + rs.getInt("idade"));
                System.out.println("CPF: " + rs.getString("cpf"));
                System.out.println("ENDEREÇO: " + rs.getString("endereco"));
                System.out.println("============================");

            }
            ConexaoFactory.close(conn, stmt, rs);
            ConexaoFactory.close(conn, stmt);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectById(Cadastro cadastro) {
        String sql = "SELECT * FROM cadastro.cliente where id=" + cadastro.getId();
        Connection conn = ConexaoFactory.getConexaoCadastral();
        try {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.first()) {
                System.out.println("ID: "+ rs.getInt("id"));
                System.out.println("NOME: "+ rs.getString("nome"));
                System.out.println("IDADE:"  + rs.getInt("idade"));
                System.out.println("CPF: " + rs.getString("cpf"));
                System.out.println("ENDEREÇO: " + rs.getString("endereco"));
                System.out.println("============================");

            }
            ConexaoFactory.close(conn, stmt, rs);
            ConexaoFactory.close(conn, stmt);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectMetaData() {
        String sql = "SELECT * FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexaoCadastral();


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
