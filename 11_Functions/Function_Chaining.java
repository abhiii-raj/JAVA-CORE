public class Function_Chaining {
    public static void main(String args[]){
        greet1();
        System.out.println("Bye !!!");
    }
    
    public static void greet1(){
        greet2();
        System.out.println("Hello");
    }

    public static void greet2(){
        greet3();
        System.out.println("Namaste");
    }

    public static void greet3(){
        System.out.println("Bonjour");
    }
}
