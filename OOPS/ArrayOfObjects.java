public class ArrayOfObjects {
    public static void main(String abhi[]) {
        Student clas[] = new Student[5];

        clas[0] = new Student(1, "Abhi", 'A');
        clas[1] = new Student(2, "Shubham", 'B');
        clas[2] = new Student(3, "Bindu", 'C');
        clas[3] = new Student(4, "Khushi", 'A');
        clas[4] = new Student(4, "Aastha", 'B');

        for (int i = 0; i < clas.length; i++) {
            Student student = clas[i];
            System.out.println("Id: " + student.id + " ; Name: " + student.name + " ; Grade: " + student.grade);
        }
    }
}

class Student {
    public int id;
    public String name;
    public char grade;

    public Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
