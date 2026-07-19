public class Interrupt {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Running...");
            }
        });

        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}


/*
    Thread -> interrupt flag (default false);
    t1.interrupt() -> sends a signal  to t1 thread  that it 
                        should stop doing what its doing 
    we can gracefully handle a thread 
    --> you can make a thread run until a condition 
    --> cancelling a long running task (agar bahar se koi interrupt agar true kar de tabhi rok do thread ko)
    --> use to stop a thread pool

    interrupt apply karne ke liye --> interrupt();
    check karne ke liye --> isInterrupted() and interrupted()

    isInterrupted() -> return the interrupt value of flag(true / false);
    interrupted() -> return the interrupt value of flag as well as sets the flag value to its default value

    wait(), sleep(), join() --> [TIMED WAITING , WAITING] --> when we call interrupt method then we get InterruptedException
*/