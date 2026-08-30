
public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Divyansh", 22, 101, "AIET");
        s1.display();
        s2.display();

    }
}
class Student {
    String name;
    int age;
    int rollNo;
    String college;

    Student(String n, int a, int rn, String clg) {
        name = n;
        age = a;
        rollNo = rn;
        college = clg;
    }

    
    Student() {
        name = "Unknown";
        age = 18;
        rollNo = 1;
        college = "ABC";
    }
    void display() {
        System.out.println("Name: " + name + ", age: " + age + ", college: " + college + ", Roll Number: " + rollNo);
    }

}
