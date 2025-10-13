public class Main {
    public static void main(String abhi[]){
        Student st = new Student(13238, "Abhi", 'A');
        System.out.println("Id : "+ st.id);
        System.out.println("Name : "+ st.name);
        System.out.println("Grade : "+ st.grade);
    }
}

class Student{
    public int id;
    public String name;
    public char grade;

    public Student(int id, String name, char grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
