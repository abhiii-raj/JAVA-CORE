public class Thread4 {
    public static void main(String args[]){
        Thread t1 = new Thread(() -> {
            System.out.println("Name of the thread is: " + Thread.currentThread().getName());
        });

        t1.start();
        t1.start();// gives IllegalStateException
    }
}