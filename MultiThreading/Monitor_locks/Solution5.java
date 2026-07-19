public class Solution5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> Counter.increment());
        Thread t2 = new Thread(() -> Counter.increment());

        t1.start();
        t2.start();
        
        System.out.println(Counter.getCount());

    }
}

class Counter{
    private static int count;

    public static void increment(){
        // static synchronised
        synchronized(Counter.class){
            count++;
        }
    }

    public static int getCount(){
        return count;
    }
}
