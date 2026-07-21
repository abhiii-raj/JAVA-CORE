public class MultplieLocks {
    public static void methodB(){
        try{
            System.out.println(Thread.currentThread().getName() + " enters into methodB");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + " exists form methodB");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void methodA(){
        try{
            System.out.println(Thread.currentThread().getName() + " enters into methodA");
            try{
                methodB();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + " exits form methodA");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[]){
        Thread t1 = new Thread(() -> {
            try{
                methodA();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        });

        t1.start();
    }
}


//     lock.lock();
//     lock.lock();
//     lock.lock();
//     /////
//     /// 
//     /// 
//     lock.unlock();
//     lock.unclock();
//     lock.unlock();

/*
    Synchronised bhi by-default reentrant hoti hai
    lekin reentrant give manual control over the thread or lock

    Lock lock = new ReentrantLock();
    [IMPORTANT METHODS]
        -- lock.lock();
        -- lock.unlock();
        -- lock.tryLock();
        -- lock.tryLock(Timeout, TimeUnit)
            example 
            if(tryLock(2, TimeUnit.seconds)){}
            else{}
            
            agar 2 second mein lock nahi hua then else part wala execute kar do

        -- lock.isLocked() - (true/false)
            yeh jo object hai kisi thread ke thorugh lock hai ya nahi
            method ke bich mein hi locked ho jaye 
            atomic opeartion nahi hota hai
            
        -- isHeldByCurrentThread()
            jo thread avi run kar rhi hai kya usi ne lock karke rakha hai

        -- getHoldCount()
            kyuki ek thread multiple time kisi object ko lock kar skata hai, toh yeh batayega ki ek thread ne kitni baar lock aquire kara hai 
            
            ReentrantLock l1 = new ReenterantLock()
            always make a unfair lock
            kisi bhi thread ko access de dega critical section ke andar jaane ka
*/
