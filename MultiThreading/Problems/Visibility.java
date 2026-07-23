public class Visibility {
    static boolean flag = false;
    public static void main(String args[]){
        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            flag = true;
            //cache -> flag = true => memory = flag => true; 
        });

        Thread t2 = new Thread(() -> { // cache -> flag = false
            while(!flag){
                // System.out.println("Thread 2 is running...");
                // println is synchronized
            }
            System.out.println("Thread 2 is finished");
        });

        t1.start();
        t2.start();
    }
}
