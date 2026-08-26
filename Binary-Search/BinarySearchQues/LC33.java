public class LC33 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 6));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int firstHalf = binarySearch(nums,target,0,pivot);
        if(firstHalf != -1) {
            return firstHalf;
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if( target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } if(arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start =  mid + 1;
            }
        }
        return - 1;
    }
}
