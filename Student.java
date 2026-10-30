class Student {
    String name;
    int age;
    String department;
}

public class method {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Pratheeba";
        s1.age = 19;
        s1.department = "CSE";

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Department: " + s1.department);
    }
}
