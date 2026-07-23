import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowExample {
    public static void main(String[] args) {
        try{
            validateAge(-7);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static void validateAge(int age){
        if(age <= 0){
            throw new IllegalArgumentException("Age is not valid");
        }
        else{
            System.out.println("Age is valid");
        }
    }
}