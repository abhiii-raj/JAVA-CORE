import java.util.Scanner;

public class CustomException{

    public static void checkEligibility(int age) throws InvalidAgeException{
        if(age <= 0){
            throw new InvalidAgeException("Age is not valid");
        }
        else{
            System.out.println("Valid age");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter your age: ");
                int age = sc.nextInt();
                checkEligibility(age);
            }
            catch(InvalidAgeException e){
                System.out.println(e.getMessage());
            }
        }
    }
}


class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message){
        super(message);
    }
}