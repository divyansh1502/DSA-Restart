
public class diamond {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n) {
        for (int i = 0; i < n * 2 - 1; i++) {
            int x = i > n - 1 ? i - n + 1: n - i - 1;
            for (int j = 0; j < x; j++) {
                System.out.print("  ");
            }
            int y = i > n - 1 ? (n * 2 - i) * 2 - 3: i * 2 + 1;
             for (int j = 0; j < y; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
