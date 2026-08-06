
public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        System.out.println("Before Swapping");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("After Swapping");
        swap(a,b);
    }
    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("a : " + x);
        System.out.println("b : " + y);
    }
}
