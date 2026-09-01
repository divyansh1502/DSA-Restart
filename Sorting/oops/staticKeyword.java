public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Divyansh", 22, 101);
        Student s2 = new Student("Shagun", 21, 102);
        
        // Student.college = "AIET";

        s1.display();   
        s2.display();  
        

    }
}
class Student {
    String name;
    int age;
    int rollNumber;
    static String college;

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Roll Number: " + rollNumber + ", College: " + college);
    }
    static {
        college = "AIET";
    }
}
