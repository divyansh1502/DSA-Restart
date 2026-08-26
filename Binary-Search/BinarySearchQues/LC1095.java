public class LC1095 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,1};
        int target = 3;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target) {
        
        int peak = findPeakIndex(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        } else {
            return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
        }
    }
    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
                if(arr[mid] < arr[mid + 1]) {
                    start = mid + 1;
                }
                else {
                    end = mid;
                }
        }
        return start;
    }
    static int orderAgnosticBS(int[] nums, int target, int start, int end) {
        

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
}//