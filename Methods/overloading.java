
public class overloading {
    public static void main(String[] args) {
        fun(69);
        fun("Divyansh");
        fun(33, 58);
        System.out.println(sum(22, 65));
        System.out.println(sum(22, 65, 65));
    }
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }
    static void fun(int a, int b) {
        System.out.println(a + " " + b);
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
