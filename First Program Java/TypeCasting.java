import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println(num);

        //Type Casting
        int n = (int)(65.25f);
        System.out.println(n); 

        //Automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

        byte x = 40;
        byte y = 80;
        byte z = 100;

        int d = (x * y) / z;
        System.out.println(d);

        int number = 'A';
        System.out.println(number);
    }
}
