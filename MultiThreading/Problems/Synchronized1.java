public class Synchronized1 {
    public static void main(String args[]){
        Test test = new Test();

        Thread t1 = new Thread(() -> test.show());
        Thread t2 = new Thread(() -> test.show());

        t1.start();
        t2.start();
    }
}

class Test{
    public void show(){
        System.out.println(Thread.currentThread().getName() + "," + "Inside show");

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e) {};

        System.out.println(Thread.currentThread().getName() + ", " + "Outside show");
    }
}


/*
    // IMPORTANCE OF SYNCHRONIZED (whenever you read, you are going to read from main memory)
    -> To protect shared data
    -> To make any opeartion atomic 
    -> To ensure visibilty  
    -> to prevent reordering
*/