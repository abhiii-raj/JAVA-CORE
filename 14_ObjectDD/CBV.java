public class CBV {
    public static void increment(int x, int y){
        x = x + 10;
        y = y + 10;
    }
    public static void main(String args[]){
        int x = 4;
        int y = 5;
        System.out.println(x + " , "+ y);
        increment(x, y);
        System.out.println(x + " , "+ y);
    }    
}
