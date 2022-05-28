import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {

    String hostName = "localhost:8080";
    String dbName = "library14052022";
    String username = "root";
    String password = "123";

    String url = "jdbc:mysql://"+hostName+"/"+dbName;
    public Connection connect(){
        //Tạo đối tượng connection
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}