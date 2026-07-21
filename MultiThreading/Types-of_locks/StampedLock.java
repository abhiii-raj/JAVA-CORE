import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
// import java.util.concurrent.locks.StampedLock;

public class StampedLock {
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

    StampedLock lock = new StampedLock();

    public void read(){
        long stamp = lock.tryOptimisticRead();
        int currentValue = value;
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){};
        
        if(lock.validate(stamp) == false){
            //fallover logic
            //try pessimistic read
            stamp = lock.readLock();
            try{
                currentValue = value;
            }finally{
                lock.unlockRead(stamp);
            }
        }
        System.out.println(Thread.currentThread().getName() + " reads value as : " + currentValue);
    }

    public void write(int newValue){
        long stamp = lock.writeLock();
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
            lock.unlockWrite();
        }
    }
}
