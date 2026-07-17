public class IsAlive {
    public static void main(String args[]){
        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        });

        System.out.println(t1.isAlive()); // false

        t1.start(); // ready to run on the cpu
        
        System.out.println(t1.isAlive()); // true
        
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        // jab main thread 3second ke liye rukegi toh t1 thread exceute ho chuki hogi

        System.out.println(t1.isAlive());//false
    }
}
