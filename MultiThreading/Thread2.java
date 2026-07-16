public class Thread2 {
    public static void main(String args[]){
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();
    }
}


class MyThread implements Runnable{
    @Override
    public void run(){
        while(true){
            System.out.println("Thread A is running");
        }
    }
}
