public class CurrentThread {
    public static void main(String args[]){
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        
        t1.setName("worker-1");  // name of the thread is set to worker-1
        t1.start();
    }
}
