public class JoinFun {
    public static void main(String args[]) throws InterruptedException{
        System.out.println("Main thread starts");

        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Custom thread starts");
        });
        
        t1.start();
        // t1.join(); // let the t1 thread to complete its execution first
        // // jaise hi main thread yaha pahuchi hogi waiting state mein chali jayegi
        
        //overloaded methods
        t1.join(1000); 

        System.out.println("Main thread ends");
    }
}

/*
    Main thread - > RUNNABLE
    t1.join -> Main Thread -> WAITING
    T1 thread -> RUNNABLE -> TERMINATED
    Main thread -> WAITING -> RUNNING

    overloaded method t1.join(1000) -> main thread -> timed waiting

    yield() -> dildar method hoti hai
    i am able to give my cpu time to a thread having same priority and thats want to run

*/