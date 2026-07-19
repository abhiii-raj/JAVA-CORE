public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("custom thread ");
        });

        System.out.println(t1.getPriority()); // 5
        t1.setPriority(10);
        System.out.println(t1.getPriority()); //10
    }
}



/*
    priority is just an indication to the os for a thread to give more cpu time to that thread having greater priority but the thread is non-determinitsic in nature
    you cnnot predict the nature of thread running order

    Depends on os
    --> may respect priority
    --> may partially respect 
    --> may not at all

    three states of priority
    MIN_PRIORITY = 1;
    MAX_PRIORITY = 10;
    NORM_PRIORITY = 5; (by default);

    getPriority() -> int value (static function)
*/