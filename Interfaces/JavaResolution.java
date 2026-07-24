public class JavaResolution {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
    }
}

// java Resolution rule

interface A{
    default void fun(){
        System.out.println("Inside A Interface");
    }
}


class B{
    public void fun(){
        System.out.println("Inside B class");
    }
}

class C extends B implements A{
    //it will print B function if C class doesnt have any implementation of the method
}
