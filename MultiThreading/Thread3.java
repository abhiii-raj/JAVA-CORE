public class Thread3 {
    public static void main(String args[]){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        
        Thread t1 = new Thread(() -> {
            System.out.println("Name of 1st thread is : "+ Thread.currentThread().getName());
            System.out.println("Id of 1st thread : " + Thread.currentThread().getId());
        });
        
        Thread t2 = new Thread(() -> {
            System.out.println("Name of 2nd thread is : "+ Thread.currentThread().getName());
            System.out.println("Id of 2nd thread : " + Thread.currentThread().getId());
        });

        t1.start();
        t2.start();

        // until you doesnt call the start method then the thread will not be registered by the os , so when you try to call run explictly then you get the reference for main thread which is created by jvm
        // t1.run() -> gives the refercenr for the main thread

        Thread t3 = new Thread(() -> {
            System.out.println("Name of the thead is : " + Thread.currentThread().getName());
        });

        t3.run(); // point to the main thread reference
    }
}