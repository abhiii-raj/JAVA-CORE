public class Thread5 {
    public static void main(String args[]){
        Thread t1 = new Thread(() -> {
            for(int i = 0 ; i <= 100 ;i++){
                if(i % 2 == 0){
                    System.out.println("Even : " + i);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0 ; i <= 100 ;i++){
                if(i % 2 != 0){
                    System.out.println("Odd : " + i);
                }
            }
        });
        System.out.println("Non-Determinsim nature of Threads");
        t1.start();
        t2.start();
    }
}

//Non-determinism nature of Threads
/*
    MultiCore processor(hardware )
    Scheduling function Algorithm
    System load
    Thread time creation
    not related to when we call our start method
*/
