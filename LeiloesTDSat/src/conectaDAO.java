import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    
    public Connection connectDB() {
        Connection conn = null;
        try {
            // Configuração da conexão (MySQL 8+)
            String url = "jdbc:mysql://localhost:3306/uc11?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "0990"; // Sua senha aqui
            
            conn = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                null, 
                "Erro ao conectar ao banco de dados:\n" + e.getMessage(),
                "Erro de Conexão",
                JOptionPane.ERROR_MESSAGE
            );
        }
        return conn;
    }
}