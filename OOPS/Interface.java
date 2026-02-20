public class Interface {
    public static void main(String abhi[]){

    }
}

//all the methods are by default public and absract
//all the variables are by default public final

interface Myinterface{
    void show();

    default void greet(){
        System.out.println("Hii Shubhu..");
    }

    static void greet2(){
        System.out.println("Hello Bindu..");
    }
}    

