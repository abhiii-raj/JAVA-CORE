import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReaderWrite {
    public static void main(String args[]){
        SharedResource res = new SharedResource();

        Thread r1 = new Thread(() -> {
            res.read();
        });
        Thread r2 = new Thread(() -> {
            res.read();
        });
        Thread r3 = new Thread(() -> {
            res.read();
        });

        Thread w1 = new Thread(() -> {
            res.write(5);
        });
        Thread w2 = new Thread(() -> {
            res.write(7);
        });
        Thread w3 = new Thread(() -> {
            res.write(9);
        });
        
        r1.start();
        r2.start();
        r3.start();
        w1.start();
        w2.start();
        w3.start();
    }
}

class SharedResource{ 
    private int value = 0;
    ReadWriteLock rwLock = new ReentrantReadWriteLock();
    Lock rl = rwLock.readLock();
    Lock wl = rwLock.writeLock();

    public void read(){
        rl.lock();
        try{
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + " read values");
            // return value;
        }
        finally{
            rl.unlock();
        }
    }

    public void write(int newValue){
        wl.lock();
        try{
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            value = newValue;
            System.out.println(Thread.currentThread().getName() + " changes value") ;
        }
        finally{
            wl.unlock();
        }
    }
}
