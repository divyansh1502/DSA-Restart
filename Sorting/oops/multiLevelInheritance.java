public class multiLevelInheritance {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        engineeringStudent es = new engineeringStudent();
        cseEngineeringStudent cse = new cseEngineeringStudent();
        
        cse.computerLab();
        cse.attendLabs();
        cse.markAttendence();

        es.attendLabs();
        es.markAttendence();

        s1.markAttendence();
    }
}
class Student {
    void markAttendence() {
        System.out.println("Attendence Marked");
    }
}
class engineeringStudent extends Student {
    void attendLabs() {
        System.out.println("Lab attended");
    }
}
class cseEngineeringStudent extends engineeringStudent {
    void computerLab() {
        System.out.println("Computer lab attended");
    }
}
/*
Multilevel inheritance

Student(Parent) --> Grandfather
|
|
|
V
engineeringStudent(Parent/Child both) --> Father
|
|
|
V
cseEngineeringStudent(Child) --> Child
*/
