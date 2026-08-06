import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(13, 25, 63, 5, 23, 87);
        multiple(44,55, "Yash", "Shagun", "Divyansh", "Abhay", "Aadhya");
    }
    static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
