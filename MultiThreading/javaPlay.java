public class javaPlay {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void greet(String name, int val){
        System.out.println("First greet");
    }
    public static void greet(int val, String name){
        System.out.println("second greet");
    }

    public static void main(String abhi[]){
        System.out.println(sum(5, 3));
        System.out.println(sum(5, 3, 4));

        greet("Shivansh", 10);
        greet(10, "Shivansh");
    }
}

class Calculator extends javaPlay{
    private int a;
    private int b;

    @Override
    public int sum(int a, int b){
        return a+b;
    }

}


/*
[PILLARS]
Abstraction
Inheritance
Encapuslation
Polymorphsim
*/

// abstract class HeadQuarter{
//     abstract void deposit(double amount);
//     abstract void withdraw(double amount);
//     public void show(){
//         System.out.println("Hiii");
//     }
// }

// class Bank extends HeadQuarter{
//     private double balance;

//     @Override
//     public void deposit(double amount){

//     }

//     @Override
//     public void withdraw(double amount){

//     }
// }