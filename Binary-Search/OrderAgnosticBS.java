public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-37, -25, -13, -3, 0, 1, 3, 4, 9, 15, 19, 23, 28, 34, 42, 56};
        int target = -3;
        System.out.println(orderAgnosticBS(arr, target));
    }
    static int orderAgnosticBS(int[] nums, int target) {
        // int start = 0;
        // int end = nums.length - 1;
        // if(nums[start] > nums[end]) {
        //     while(start <= end) {
        //         int mid = start + (end - start) / 2;
        //         if(target > nums[mid]) {
        //             end = mid - 1;
        //         } else if(target < nums[mid]) {
        //             start = mid + 1;
        //         } else {
        //             return mid;
        //         }
        //     }
        // }
        // else {
        //     while(start <= end) {
        //         int mid = start + (end - start) / 2;
        //         if(target > nums[mid]) {
        //             start = mid + 1;
        //         } else if(target < nums[mid]) {
        //             end = mid - 1;
        //         } else {
        //             return mid;
        //         }
        //     }
        // }
        int start = 0;
        int end = nums.length - 1;

        boolean isAsc = nums[start] < nums[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if(target > nums[mid]) {
                     start = mid + 1;
                 } else{
                     end = mid - 1;
                 }
            } else {
                if(target < nums[mid]) {
                     start = mid + 1;
                 } else{
                     end = mid - 1;
                 }
            }
        }
        return -1; 
    }
}
