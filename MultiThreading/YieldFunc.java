public class YieldFunc {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 10; i++){
                System.out.println("T1 : " + i);
                Thread.yield();
                // main apna cpu time kisi or ko dene ke liye taiyyar hu jo wait kar rhi hogi and having of same priority
                // might be possible os reject kar de (non deterministic nature of thread execution)
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1 ;i <= 10 ;i++){
                System.out.println("T2 : " + i);
            }
        });
        
        t1.start();
        t2.start();
    }
}