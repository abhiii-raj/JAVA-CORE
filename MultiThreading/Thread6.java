public class Thread6 {
    public static void main(String args[]){
        Thread mainThread = Thread.currentThread();

        Thread t1 = new Thread(() ->{
            System.out.println("Name of the thread is: " + Thread.currentThread().getName());
            System.out.println("State of the main thread is: " + mainThread.getState());
        });

        //new state
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());
        
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println(t1.getState());

    }
}
