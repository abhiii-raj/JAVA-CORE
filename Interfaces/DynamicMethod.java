public class DynamicMethod {
    public static void main(String[] args) {
        // Payment p = new CreditCard();
        Payment p = new DebitCard();
        p.pay();
    }
}

interface Payment{
    void pay();
}

class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying via credit card");
    }
}

class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying via debit card");
    }
}
