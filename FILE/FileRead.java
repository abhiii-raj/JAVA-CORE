import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileRead {
    public static void main(String args[]){
        try{
            FileReader reader = new FileReader("data.txt");
            BufferedReader breader = new BufferedReader(reader);
            String line;
            while((line = breader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
