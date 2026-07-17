public class YieldFunc {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 10; i++){
                System.out.println("T1 : " + i);
                Thread.yield();
                // main apna cpu time kisi or ko dene ke liye taiyyar hu jo wait kar rhi hogi
                // migh be possible os reject kar de
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
