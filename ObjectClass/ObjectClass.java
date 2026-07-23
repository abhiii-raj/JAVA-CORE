public class ObjectClass {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student(22, "Abhi");
        Student s2 = new Student(22, "Abhi");
        Student s3 = new Student(22, "Aastha");
        
        System.out.println(s1.toString()); // returns the string form of student

        System.out.println(s1.equals(s2)); // returns true
        System.out.println(s1.equals(s3)); // returns false

        System.out.println(s1.hashCode() == s2.hashCode()); // true
        System.out.println(s1.hashCode() == s3.hashCode()); // false

        System.out.println(s1.getClass().getName()); // cannot override

        Student s4 = (Student) s1.clone();
        System.out.println(s4.age + " , " + s4.name);
        System.out.println();

    }
}

class Student extends Object implements Cloneable{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return name + ", " + age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        
        if(this.getClass() != obj.getClass()){
            return false;
        }

        Student s = (Student)obj;
        return this.name == s.name && this.age == s.age;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = result * 31 + age;
        result = result * 31 + name.hashCode();
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
