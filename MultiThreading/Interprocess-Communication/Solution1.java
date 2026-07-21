public class Solution1 {
    public static void main(String[] args) {
        Box box = new Box();

        //[PRODUCERS]
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                try {
                    Thread.sleep(100);
                    box.producer(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        
        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                try {
                    Thread.sleep(100);
                    box.producer(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        //[CONSUMERS]
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                try {
                    Thread.sleep(150);
                    box.consumer();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });


        Thread t4 = new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                try {
                    Thread.sleep(150);
                    box.consumer();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Box {
    volatile Integer item = null;
    volatile Boolean flag = false;

    synchronized public void producer(Integer value) throws InterruptedException {
        while (flag == true) {
            wait();
        }

        item = value;
        flag = true;
        System.out.println( Thread.currentThread().getName() + " Producer produces : " + item);
        // notify(); //agar koi consumer waiting mein baitha ho usko nikal lo
        notifyAll();

    }

    synchronized public void consumer() throws InterruptedException {
        while (flag == false) {
            wait();
        }
        System.out.println(Thread.currentThread().getName() +"Consumer consumes : " + item);
        item = null;
        flag = false;
        // notify(); // agar koi producer baith ho usko runnable mein leke aao aur value
        // produce kardo
        notifyAll();
    }
}

// class Box{
// volatile Integer item = null;
// volatile Boolean flag = false;

// synchronized public void producer(Integer value){
// while(flag == true){
// // do nothing
// }

// item = value;
// flag = true;
// System.out.println("Producer produces : " + item);
// }

// synchronized public void consumer(){
// while(flag == false){
// // do nothing
// }
// System.out.println("Consumer consumes : " + item);
// item = null;
// flag = false;
// }
// }

/*
 * This approach consumes CPU time. (Busy Waiting)
 * agar maan lete hai ki producer ko 2 sec lagta hai value ko generate karne
 * mein then consumer CPU time leta rahega
 * 
 * Isme race consition bhi aa ksti hai
 * agar maan lete hai ki intially flag false hai then produer item ki value ko
 * change kar dega and aur flag ko true mar kara then context swtiching ho jaye
 * tab race condition aa jayegi
 * 
 * toh isse bachne ke liye ham lagate hai [SYNCHRONIZED] keyword
 * toh iss approach mein bhi problem hai.
 * ho skata hai ki [DEADLOCK] mein chala jaye.
 * 
 * 
 * WAIT -> it is used in synchronised block
 * if not then gives IllegalStateException
 * 
 * Initially
 * flag = false;
 * value = null
 * 
 * then consumer -> goes into waiting using wait method and it releases the lock
 * so that new thread will call the producer method so that it call the notify
 * to bring consumer method from waiting to runnable
 * 
 * agar koi thread waiting state se bahar nikli hai then woh blocked state mein
 * jayegi and woh jab waiting state mein gaya hoga toh usne monitor locks
 * release kar diye honge
 * 
 * har ek object ka ek waiting queue hoga
 * 
 * notify() -> kisi ek thread ko waiting queue se bahar nikalega randomly
 * 
 * running --- blocked --- runnable --- running
 * 
 * jab ki koi thread waiting queue se bahar nikalti hai then woh blocked state
 * mein jaati hai
 * 
 * 
 * [wait()] -> must be in synchronised block
 * -- release monitor locks
 * --it goes in waiting state
 * --it stays there until another thread wakes it up
 * exception -> IllegalMonitorStateException
 * 
 * [notify()] -> must be in synchronised block
 * -- one random thread pickup from the waiting queue
 * -- that random thread move to the blocked state
 * -- compete for the lock
 * -- once lock is occupied then again comes into the running state
 * exception -> IllegalMonitorStateException
 * 
 * [notifyAll()] -> must be in synchronised block
 * -- All thread which are in the waiting queue moves to the blocked state
 * -- they all try to acquire the block
 * -- only one thread gets the lock at a time
 * 
 * more safer than notify()
    
saare hi active hote hai aur galat thread chalega toh phir se woh waiting queue mein chala jayega   
 */