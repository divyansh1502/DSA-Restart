public class classes {
    public static void main(String[] args) {

        Students s1 = new Students();

        s1.name = "Divyansh";
        s1.age = 22;
        s1.college = "AIET";
        s1.fees = 60000;

        Students s2 = new Students();
        
        s2.name = "Aryan";
        s2.age = 23;
        s2.college = "AIET";
        s2.fees = 60000;

        System.out.println(s1.name);
    }
}
class Students {
    String name;
    int age;
    String college;
    int fees;
}