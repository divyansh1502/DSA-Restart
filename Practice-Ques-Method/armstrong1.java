

public class armstrong1 {
    public static void main(String[] args) {

        armstrong();
    }

    static void armstrong() {
        for (int i = 1; i < 1000; i++) {

            int original = i;
            int temp = i;
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp /= 10;
            }
            if (original == sum) {
                System.out.println("Armstrong number: " + original);
            }
        }
    }
}
