package Jdbc.Conn;
import java.sql.*;

public class ConexaoFactory {

    public static Connection getConexao() {
        String url = "jdbc:mysql://localhost:3306/agencia?enabledTLSProtocols=TLSv1.2";
        String user = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    public static Connection getConexaoCadastral() {
        String url = "jdbc:mysql://localhost:3306/cadastro?enabledTLSProtocols=TLSv1.2";
        String user = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void close(Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stmt) {
        close(connection);
        try {
            if (stmt != null)
                stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stmt, ResultSet rs) {
        close(connection, stmt);
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*public static void main(String[] args) {
        Connection connection = getConexao();
        if(connection != null){
            JOptionPane.showMessageDialog(null, "Conectado");
        }
    }*/
}
