public class Thread1 {
    public static void main(String args[]){
        MyThread  myThread = new MyThread();
        myThread.start();
    }
}

// using thread class
class MyThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Thread A is running");
        }
    }
}
