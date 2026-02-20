import java.sql.*;
import java.sql.Connection; 

public class Example{
    public static void main(String args[]) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Admin@123";
        String query = "SELECT * FROM student";
        
        //loading drivers..
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded successfully.");
        }catch(ClassNotFoundException e){
            System.out.println("Drivers not loaded");
        }

        //making connections
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                int roll_no = rs.getInt("roll_no");
                String name = rs.getString("name");
                String city = rs.getString("city");

                System.out.println("Id: "+ roll_no + " ,Name: "+ name + " City: "+ city);
            }

            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}