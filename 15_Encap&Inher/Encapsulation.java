public class Encapsulation {
    public static void main(String args[]){
        BankAccount b = new BankAccount();
        b.setter(10000.1254);
        b.getter();
        b.withdraw(500);
        b.getter();
        b.deposit(500);
        b.getter();

        // Application of Encapsulation is,
        // 1. To bind properties and behavoiurs in a single unit called as class.
        // 2. It does not provide unrestricetd access to the properties.
        // 3. It gives better control upon the fileds and behavoiours.
    }    
}

class BankAccount{
    private double balance;

    public void setter(double bal){
        this.balance = bal;
    }

    public void getter(){
        System.out.println(this.balance);
    }

    public void withdraw(double amt){
        if(balance >= amt){
            balance -= amt;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amt){
        balance += amt;
    }
}
