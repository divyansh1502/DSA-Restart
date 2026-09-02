public class UseOfSuperKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        s1.display();

    }
}
class Student {
    String name = "Divaynsh";
    int age = 22;
    int rollNumber = 101;

    void display() {
        EngineeringStudent es1 = new EngineeringStudent();
        es1.display();
    }
    
}
class EngineeringStudent extends Student {
    String name = "Shagun";
    int age = 20;
    int rollNumber = 102;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Roll number: " + rollNumber + ", Name: " + super.name + ", Age: " + super.age + ", Roll number: " + super.rollNumber );
    }
}
