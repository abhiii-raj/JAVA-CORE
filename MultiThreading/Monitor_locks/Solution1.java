public class Solution1 {
    public static void main(String args[]) throws InterruptedException{
        Test test = new Test();

        Thread t1 = new Thread(() -> {
            test.show();
        });

        Thread t2 = new Thread(() -> {
            test.show();
        });

        t1.start();
        t2.start();
        
        // this ensure main thread waits until both the worker thread finishes
        t1.join();
        t2.join();

        System.out.println("Program ends");
    }
}

class Test{
    public synchronized void show(){
        System.out.println(Thread.currentThread().getName() + " inside show method.");

        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(Thread.currentThread().getName() + " outside show method.");
    }
}


/*  
    [SYNCHRONISED-KEYWORD] / [MONITOR-LOCKS] / [OBJECT-LOCKS]
    -- T1 acquires lock
    -- T2 tries to acquire lock, go to blocked state
    -- T1 perfrom all the task
    -- T1 exists / releases lock
    -- T2 acquires lock
*/

/*
    WHY DO WE NEED SYNCHRONIZED KEYWORD
    -- To protect shared data
    -- To make any operation atomic
    -- To ensure visibility
    -- To prevent re-ordering 
*/

/*
    synchronised keyword method per lock nahi lagata
    class ke object per lagata hai.

    Every object in the java has Internal lock and maintained by JVM
*/