public class FunOver {
    public static void main(String args[]){
        int result = sum(10, 12);
        System.out.println(result);

        int result1 = sum(10, 12, 15);
        System.out.println(result1);
        
        int result3 = sum(10.0000, 12.4589);
        System.out.println(result3);
        
        greet("Abhi", 21);
        greet(17, "Aastha");
    }
    
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int sum(double a, double b){
        return (int)(a+b);
    }

    public static void greet(String name, int age){
        System.out.println("Hello: " + name + ", " + "Your age is: " + age);
    }

    public static void greet(int age, String name){
        System.out.println("Hello: " + name + ", " + "Your age is: " + age);
    }
}
