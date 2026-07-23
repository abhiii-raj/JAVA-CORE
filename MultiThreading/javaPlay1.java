public class javaPlay1 {
    public static void main(String[] args) {
        methodA();
    }
    public static void methodA(){
        System.out.println("filling the stack space");
        methodA();
    }
}

/*
    Exceptional Handlig
        |--Error
            |--not recoverable / not handleable
        |--Exception
            |-- recoverable/ handleable
*/