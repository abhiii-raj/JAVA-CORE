public class CBR {
    public static void increment(Random r){
        r.x = r.x + 10;
        r.y = r.y + 10;
    }
    public static void main(String args[]){
        Random r1 = new Random(4, 5);
        System.out.println(r1.x + " , " + r1.y);
        increment(r1);
        System.out.println(r1.x + " , " + r1.y);
    }    
}

class Random{
    int x;
    int y;

    public Random(int x, int y){
        this.x = x;
        this.y = y;
    }
}
