public class ImplicitConv{
    public static void main(String args[]){
        byte b = 44;
        // compiler khud se kar dega
        int a = b;  //implicit conversion of byte int int
        System.out.println("Value of b: " + b);
        System.out.println("Value of a: " + a);

        // character to int
        char ch = 'a';
        int c = ch;
        System.out.println(c); //the unicode correspondng to char ch will stored into the memory.i.e 97

        // //int to character
        // int i = 97;
        // char d = i; will get error
    }
}