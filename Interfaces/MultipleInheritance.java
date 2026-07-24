public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
    }
}

interface A{
    void fun();
}

interface B{
    void fun();
}

class C implements A,B{
    @Override
    public void fun(){
        System.out.println("Multiple inheritance achieved");
    }
}
