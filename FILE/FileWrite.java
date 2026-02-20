import java.io.*;
import java.io.IOException;

public class FileWrite{
    public static void main(String args[]){
        try{
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hii this is abhi raj");
            writer.close();
            System.out.println("file write successfully");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}