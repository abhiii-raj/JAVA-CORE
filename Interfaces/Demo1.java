public class Demo1 {
    public static void main(String[] args) {
        Thar thar = new Thar();
        thar.drive();
    }
}

interface Car{
    void drive();
}

class Thar implements Car{
    @Override
    public void drive(){
        System.out.println("Off-Roading vehicle");
    }
}
