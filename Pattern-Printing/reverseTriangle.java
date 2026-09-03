
public class reverseTriangle {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
