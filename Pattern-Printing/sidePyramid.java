
public class sidePyramid {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        int k = 2 * n - 1;
        for (int i = 1; i <= k; i++) {
            int totalCols = i > n ? 2 * n - i : i;
            for (int j = 1; j <= totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    //     int k = n;
    //     int l = 0;
    //     for (int i = n; i <= 2*n - 1; i++) {
    //         k--;
    //         l++; 
    //         for (int j = 1; j <= n - l; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    }
}
