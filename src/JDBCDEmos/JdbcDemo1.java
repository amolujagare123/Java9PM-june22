package JDBCDEmos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

       // 1. Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

       // 2. Creating a connection
        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/730batch"; // mysql
        Connection con = DriverManager.getConnection(url,user,pass);

        //  3. Creating statements
        Statement st = con.createStatement();

       //  4. Executing the query
        // DDL - Data definition Language | DML - Data Manipulation Language
        // insert , update , delete -DML | select - DDL
     //   String sql = "insert into student value (1, 'amol', 'IT',89)";
       // String sql = "update student set name ='ganesh' where rno=1";
        String sql = "delete from student where rno=1";


        st.executeUpdate(sql);


    }
}
