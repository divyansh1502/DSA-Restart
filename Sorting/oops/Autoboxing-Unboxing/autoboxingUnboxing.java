
public class autoboxingUnboxing {
    public static void main(String[] args) {

        //Autoboxing
        int x = 10;
        Integer y = x; //Assignments

        // OR
        // Integer y = new Integer(x); 
        // Integer y = Integer.valueOf(x);

        System.out.println(x);
        System.out.println(y);

        // Unboxing
        Integer a = 100;
        int b = a;

        // OR
        // Integer a = new Integer(100); 
        // Integer a = Integer.valueOf(100);

        System.out.println(a);
        System.out.println(b);

        Integer i = 250;
        Integer j = 350;
        int sum = i + j; //Arithmetic operation
        System.out.println(sum);

        //null pointer exception ==> during runtime
        /*
            Integer d = null;
            int e = d;
            System.out.println(e);
         */
        Integer k = 500;
        printInt(k); //Method call
    }
    static void printInt(int n) {
        System.out.println(n);
    }
}
// autoboxinf and unboxing happen in these of following: 

// 1. Assignments
// 2. Method call
// 3. Arithemitic Operation