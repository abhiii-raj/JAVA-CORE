public class Recursion {
    public static void main(String[] args) {
        int result = printFib(10);
        System.out.println(result);
    }   
    public static int printFib(int x){
        if(x == 0 || x == 1) return x;
        return printFib(x-1) + printFib(x-2);
    }
}
