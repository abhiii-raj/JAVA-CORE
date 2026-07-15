import java.util.Scanner;
public class CustomException {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        try{
            checkAge(age);
        }catch(CheckEligibiltyException e){
            System.out.println(e.getMessage());
        }
    }
    private static void checkAge(int age) throws CheckEligibiltyException{
        if(age <= 0){
            throw new CheckEligibiltyException("Age is not valid");
        }
        else if(age >= 18){
            System.out.println("You are eligible to vote");
        }
    }
}

class CheckEligibiltyException extends Exception{
    public CheckEligibiltyException(String message){
        super(message);
    }
}
