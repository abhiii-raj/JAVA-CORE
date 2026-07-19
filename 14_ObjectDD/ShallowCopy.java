public class ShallowCopy {
    public static void main(String args[]){
        Random r1 = new Random(4, 5);
        Random r = r1; // shallow copy
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
