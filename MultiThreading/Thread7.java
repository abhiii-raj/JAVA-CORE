public class Thread7 {
    public static void main(String args[]) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Main thread starts");

        Thread t1 = new Thread(() -> {
            System.out.println("Custom Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}

            System.out.println(Thread.currentThread().getState());
            System.out.println("Main thread: " + mainThread.getState());
        });

        t1.start();
        System.out.println("Main thread ends" + mainThread.getState());
    }
}
