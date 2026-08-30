public class classes {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Divyansh";
        s1.age = 22;
        s1.college = "AIET";
        s1.fees = 60000;

        Student s2 = new Student();
        
        s2.name = "Aryan";
        s2.age = 23;
        s2.college = "AIET";
        s2.fees = 60000;

        System.out.println(s1.name);
        s1.markAttendence();
        s1.display();

        s2.markAttendence();
        s2.display();
    }
}
class Student {
    String name;
    int age;
    String college;
    int fees;

    void markAttendence() {
        System.out.println("Attendence marked by : " + name);
    }
    void display() {
        System.out.println("Name: " + name + ", age: " + age + ", college: " + college + ", fees: " + fees);
    }
}