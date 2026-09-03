


public class numberPyramid {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row - 1; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
