import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound{
    public static void main(String args[]){
        try(FileReader fr = new FileReader("abc.txt")){
           int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); // print characters
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}