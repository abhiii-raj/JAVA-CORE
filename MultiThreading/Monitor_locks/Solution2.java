public class Solution2 {
    public static void main(String args[]){
        Test test1 = new Test();
        // Test test2 = new Test();

        Thread t1 = new Thread(() -> test1.m1());
        Thread t2 = new Thread(() -> test1.m2());
        
        t1.start();
        t2.start();
    }
}


class Test{
    public synchronized void m1(){
        System.out.println("m1 enters");
        
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){};
        
        System.out.println("m1 ends");
    }
    
    public synchronized void m2(){
        System.out.println("m2 enters");
        
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){};
        
        System.out.println("m2 ends");
    }
}

/*
    jab tak t1 m1 ko complete nahi kar legi na tab tak t2 bhi enter nahi karegi although dono alag mehtod hai

    because lock jo hai woh method per nahi object per lagta hai

    Whoever thread gets the cpu time first will acquire the lock on the object and no other thread will acquire the lock.
    
    t1 lock acquire kar lega m1 ke andar ghusne ke liye then t2 acquire nahi kar sakta 
*/