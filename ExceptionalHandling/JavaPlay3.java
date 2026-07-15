public class JavaPlay3 {
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
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
