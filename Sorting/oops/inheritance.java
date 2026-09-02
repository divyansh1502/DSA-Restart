public class inheritance {
    public static void main(String[] args) {
        Student s1 = new Student();
        engineeringStudent es = new engineeringStudent();
        
        s1.markAttendence();
        // s1.attendedLabs(); -->(Wrong)

        es.markAttendence();
        es.attendLabs();
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

/*
    Student(Parent)
        |
        |Inherits
        |
        V
    engineeringStudent(Child)
*/