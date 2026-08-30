
    
public class constructorChaining {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Divyansh");
        Student s3 = new Student("Abhay", 25);
        Student s4 = new Student("Agrima", 22, 104);
        Student s5 = new Student("Sobiya", 23, 105, "FGIT");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}

class Student {

    String name;
    int age;
    int rollNumber;
    String college;

    //Constructor Chaining
    Student() {
        this("Unknown", 0, 0, "Unknown");
    }

    Student(String name) {
        this(name, 0, 0, "Unknown");
    }
    Student(String name, int age) {
        this(name, age, 0, "Unknown");
    }
    Student(String name, int age, int rollNumber) {
        this(name, age, rollNumber, "Unknown");
    }
    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Roll Number: " + rollNumber + ", College: " + college);
    }
}




