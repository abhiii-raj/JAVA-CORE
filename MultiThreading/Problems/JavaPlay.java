public class JavaPlay {
    public static void main(String[] args) throws Exception{
        Resource res = new Resource();
        Thread t1 = new Thread(() -> {
            for(int i = 0 ;i < 10000 ;i++){
                res.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0 ;i < 10000 ;i++){
                res.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        res.getCount();
    }
}

class Resource{
    private int count = 0;
    public synchronized void increment(){
        count++;
    }

    public void getCount(){
        System.out.println(count);
    }
}