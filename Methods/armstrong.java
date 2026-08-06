
public class armstrong {
    public static void main(String[] args) {
        arm();
    }
    static void arm() {
        for (int i = 1; i <= 1000; i++) {
        int original = i;
        int temp = i;
        int sum = 0;
        while(temp > 0) {
            int rem =  temp % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            temp = temp / 10;
        }
        if(sum == original) {
            System.out.println("Armstrong Number Found: " + original);
        }
    }
    }
}
