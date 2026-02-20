public class TypePromotion {
    public static void main(String args[]){
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234; // valid in java

        double result = (f * b) + (i / c) - (d * s);

        // f * b --> float
        // i / c --> integer
        // d * s --> double

        System.out.println((f * b) + " , " + (i / c) + " , " + (d * s));
        System.out.println(result);

        byte bb = 50;
        bb = (byte)(bb * 2);
        System.out.println(bb);
    }   
}
