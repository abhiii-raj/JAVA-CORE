import java.util.UUID;

public class Problem1 {
    public static void main(String args[]){
        Box box = new Box();

        Thread t1 = new Thread(() -> {
            for(int i = 1 ;i <= 20 ;i++) {
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){};
                box.producer(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1 ;i <= 20 ;i++) {
                try{
                    Thread.sleep(70);
                }
                catch(Exception e){};
                box.consumer();
            }
        });

        t1.start();
        t2.start();
    }
}


class Box{
    Integer item = null;
    Boolean flag;

    public void producer(Integer value){
        item = value;
        flag = true;
        System.out.println("Producer produces : " + item);
    }

    public void consumer(){
        System.out.println("Consumer consumes : " + item);
        item = null;
        flag = false;
    }
}