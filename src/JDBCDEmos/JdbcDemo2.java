package JDBCDEmos;

import java.sql.*;

public class JdbcDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Creating a connection
        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/730batch"; // mysql
        Connection con = DriverManager.getConnection(url, user, pass);

        //  3. Creating statements
        Statement st = con.createStatement();

        //  4. Executing the query
        // DDL - Data definition Language | DML - Data Manipulation Language
        // insert , update , delete -DML | select - DDL

        String sql = "select * from candidate";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("fullName")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.print(rs.getInt("marks")+"\t");
            System.out.println(rs.getInt("phone")+"\t");
        }

      


    }
}
