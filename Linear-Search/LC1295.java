public class LC1295 {
    public static void main(String[] args) {
        int[] nums = {14, 25, 321, 256, 9548, 652, 1};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int countEvenDigit = 0;
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            int element = nums[i];
            while(element > 0) {
                element /= 10;
                count++;
            } 
            if(count % 2 == 0) {
                countEvenDigit++;
            }
        }
        return countEvenDigit;
    }
}


