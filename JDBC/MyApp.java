import java.util.*;
import java.sql.*;

public class MyApp {
    public static void main(String args[]) throws ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String pass = "Admin@123";

        try{
            Class.forName("com.mysql.cj.jdbc.driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        
        int choice = sc.nextInt();
        do{
            System.out.println("1.> Add User.. 2.> Delete User.. 3.> View User 4.");
        }while(choice != 5);
    }
}