public class Solution1 {
    public static void main(String[] args) {
        Student st = new Student(22, "Abhi");

    }
}


final class Student{
    private final int age;
    private final String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}