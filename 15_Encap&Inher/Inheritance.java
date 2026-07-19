public class Inheritance{
    public static void main(String args[]){
        /*Inheritance
        It is most important and one of the four pillars of object oriented        programming.
        It is a process or mechanism by which new classes can inherit features and properties from already exisitng classes and offers reusability
        */

        Car c = new Car();
        c.greet();
    }
}

//single inheritance
class Vehicle{
    public Vehicle(){
        System.out.println("This is a vehicle class");
    }

    public void greet(){
        System.out.println("Hello from the vehicle class");
    }
}

class Car extends Vehicle{
    public Car(){
        super(); // stores the reference of the parent class
        System.out.println("This is car class");
    }

    public void greet(){
        super.greet();
        System.out.println("Hello from the car class");
    }
}

// multilevel inheritance
class Student{
    public Student(){
        System.out.println("This is student class");
    }
}

class EngineeringStudent extends Student{
    public EngineeringStudent(){
        System.out.println("This is a Engineering Student");
    }
}

class EngineeringAlumini extends EngineeringStudent{
    public EngineeringAlumini(){
        System.out.println("This is an Engineering Alumini");
    }
}

//Hierarchical Inheritance
class Mahindra{
    public Mahindra(){
        System.out.println("Parent Company");
    }
}

class Scorpio extends Mahindra{
    public Scorpio(){
        System.out.println("Owned by mahindra");
    }
}

class Xylo extends Mahindra{
    public Xylo(){
        System.out.println("Owned by mahindra");
    }
}