import java.util.Arrays;

public class passInFunction {
    public static void main(String[] args) {
        int[] arr = {25, 35, 45, 75, 56, 95, 12};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums) {
        nums[0] = 99;
    }
}
