public class JavaPlay2 {
    public static void main(String args[]){
        //multiple try catch
        try{
            String str = null;
            str.length();
            int a = 5;
            int b = 0;
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
