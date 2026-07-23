public class Ordering {
    // static volatile int x = 0;
    // static volatile boolean flag = true;
    static int x = 0;
    static boolean flag = false;
    public static void main(String args[]){

        Thread t1 = new Thread(() -> {
            x = 10;
            flag = true;
        });

        Thread t2 = new Thread(() -> {
            if(!flag){
                System.out.println(x);
            }
        });

        System.out.println("Threads Created..");
        t1.start();
        t2.start();
    }
}

/*
    ordering can be solved by making the variables as volatile
*/