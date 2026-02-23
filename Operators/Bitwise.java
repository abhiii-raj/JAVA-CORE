public class Bitwise {
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        
        System.out.println(a & b); // and
        // if both the value are true then value is true
        System.out.println(a | b); // or
        // if one of the value are true then value is true
        System.out.println(a ^ b); // xor
        // if both the value are same then value is true
        System.out.println(a << 1); // left-shift
        // shifts the bit by one position to the left
        System.out.println(a >> 1); //right-shift
        // shifts the bit by one position to the right
        System.out.println(~a); //complement
        // convert it in bits and change the 0 -> 1 and 1 -> 0
    }
}
