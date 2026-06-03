public class Types {

    public static void greet(){
        System.out.println("Hello");
    }

    public static int giveNumber(){
        return 10;
    }

    public static void greet(String name){
        System.out.println("Namaste: " + name);
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        //There are four types of function
        /*
            1. No ip , no op
            2. No ip , op
            3. Takes input, no op
            4. Takes input, gives output
        */
        // 1.
        greet();

        // 2.
        int x = giveNumber();
        System.out.println(x);

        // 3.
        String name  ="Abhi";
        greet(name);

        // 4. 
        int result = sum(10, 12);
        System.out.println(result);

    }   
}
