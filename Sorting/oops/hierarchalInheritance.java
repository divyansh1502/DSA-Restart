public class hierarchalInheritance {
    public static void main(String[] args) {
        
    }
}
class Student {
    void markAttendence() {
        System.out.println("Attendence Marked");
    }
}
class EngineeringStudent extends Student {
    void Engineer() {
        System.out.println("Engineer");
    }
}
class MBAStudent extends Student {
    void MBA() {
        System.out.println("MBA Student");
    }
}

/*
Hierarchal level inheritance

        Student(A)
        /         \
       /           \
      /             \
EngineerStudent(B)   MBAStudent(C


*/