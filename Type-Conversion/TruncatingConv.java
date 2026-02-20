public class TruncatingConv {
    public static void main(String abhi[]){
        float f = 16.25f;
        int val = (int)f; // no type-mismatch
        System.out.println(f + " , " + val);

        double d = 300.746535156;
        int val1 = (int)d; // no type-mismatch
        System.out.println(d + " , " + val1);
    }
}
