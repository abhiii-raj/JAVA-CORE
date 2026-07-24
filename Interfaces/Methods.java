public class Methods {
    public static void main(String[] args) {
        Mahindra mh = new Mahindra();
        mh.drive();
    }    
}

interface Vehicle{
    void drive();
}

abstract class Car implements Vehicle{
    abstract public void drive();
}

class Mahindra extends Car{
    @Override
    public void drive(){
        System.out.println("Have a road presence");
    }
}
