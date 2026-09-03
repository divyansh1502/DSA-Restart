
public class rectangle {
    public static void main(String[] args) {
        pattern2(5, 4);
    }
    static void pattern2(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
