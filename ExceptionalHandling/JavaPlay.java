public class JavaPlay {
    public static void main(String args[]){
        System.out.println("Outside the try block");
        try{
            System.out.println("Inside the try block");
            int a = 5;
            int b = 0;
            System.out.println(a/b);
            System.out.println("try block ends");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("catch block ends");
    }
}