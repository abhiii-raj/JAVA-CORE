public class DeepCopy {
    public static void main(String args[]){
        Random r1 = new Random(4, 5);
        Random r2 = new Random(r1); // deep copy
    }    
}

class Random{
    int x;
    int y;

    public Random(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Random(Random r){
        this.x = r.x;
        this.y = r.y;
    }
}
