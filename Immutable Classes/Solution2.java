public class Solution2 {
    public static void main(String[] args) {
        College college = new College("IIT K", "Kanpur");
        Student st = new Student(22, "Abhi", college);
    
        System.out.println(st.getCollege().name);
        st.getCollege().name = "IIT P";
        System.out.println(st.getCollege().name);
    }
}

final class Student{
    private final int age;
    private final String name;
    private final College college;

    public Student(int age, String name, College college){
        this.age = age;
        this.name = name;
        this.college = college;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public College getCollege(){
        return this.college;
    }
}

class College{
    public String name;
    public String add;

    public College(String name, String add){
        this.name = name;
        this.add = add;
    }
}