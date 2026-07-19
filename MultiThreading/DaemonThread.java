public class DaemonThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while(true){
                System.out.println("Running...");
            }
        });

        t1.setDaemon(true);
        t1.start();

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        
        return;
    }
}

/*
    User threads, Daemon Threads
    Daemon threads -> background running threads 
    --> stop immediately when the main thread is completed

    Garbage collection --> Daemon thread

*/
