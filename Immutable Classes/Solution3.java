public class Solution3 {
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
        //defensive copy
        this.college = new College(college.name, college.add);
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public College getCollege(){
        //defensive copy
        return new College(this.college.name, this.college.add);
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

/*
    I am not giving the reference for the college, every time college is needed I am creating new object of college.
    A deep copy means: instead of just copying the reference (which points to the same object in memory), you actually create a new object with the same data, and then assign that new object’s reference.
*/