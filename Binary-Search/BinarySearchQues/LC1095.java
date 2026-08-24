public class LC1095 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findPeakIndex(arr, target));
    }
    static int findPeakIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]) {
                if(target < arr[mid]) {
                    end = mid + 1;
                } else if(target > arr[mid]) {
                    start = mid - 1;
                } else {
                    return mid;
                }
            }
        } //last wasted day of my life
        
        return -1;
    }
}