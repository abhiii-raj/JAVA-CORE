public class Solution3 {
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0 ;i <  10000 ;i++){
                c.increment();
            }
        });


        Thread t2 = new Thread(() -> {
            for(int i = 0 ;i < 10000 ;i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();
        
        // this enusre main thread waits until both the worker thread finishes
        t1.join();
        t2.join();

        System.out.println(c.getCount());
    }
}


class Counter{
    private int count;

    public void increment(){
        //noraml code
        
        synchronized(this){
            count++;
        }

        //normal code
    }

    public int getCount(){
        return this.count;
    }
}