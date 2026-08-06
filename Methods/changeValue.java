import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int[] arr = {25, 3, 25, 6, 23};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums) {
        nums[0] = 124; // if you make a change to a object via this reference variable same obj will be change
    }
}
