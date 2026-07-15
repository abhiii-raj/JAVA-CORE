public class JavaPlay1 {
    public static void main(String args[]){
        methodA(5, 0);
    }
    public static void methodA(int a, int b){
        methodB(5, 0);
    }
    public static void methodB(int a, int b){
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
