import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1); // Since one operand is a String, Java converts 1 to String and concatenates both values, producing "a1".  
        
        System.out.println("Divyansh" + new ArrayList<>());
        System.out.println("Divyansh" + new Integer(69));
        System.out.println(new ArrayList<>() + "" + new Integer(69));

        System.out.println("a" + 'b');
    }
}
