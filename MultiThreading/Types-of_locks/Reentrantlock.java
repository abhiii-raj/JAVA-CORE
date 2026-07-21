import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrantlock {
    public static void main(String args[]){
        Resource res = new Resource();

        Thread t1 = new Thread(() -> {
            res.func();
        });

        Thread t2 = new Thread(() -> {
            res.func();
        });

        Thread t3 = new Thread(() -> {
            res.func();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}

class Resource{
    Lock lock = new ReentrantLock();

    void func(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + "," + " entered.");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){};
            System.out.println(Thread.currentThread().getName() + "," + " exited.");
        }
        finally{
            lock.unlock();
        }
    }
}


/*
    [REENTRANT BLOCKS]
        Lock lock = new ReentrantLock();
        lock.lock()
         --------
        lock.unlock()

    [problems]
        -- Manual lock and unlock.
        -- If forgot to unlock then a single thread will execute.

    [good practise]
        lock.lock()
        try{
        
        }
        finally{
            lock.unlock();
        }


    // Reenntrant -> same thread can quire the lock multiple times

    lock.lock();
    lock.lock();
    lock.lock();
    /////
    /// 
    /// 
    lock.unlock();
    lock.unclock();
    lock.unlock();
*/
