public class InfiniteLengthArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 9, 12, 16, 19, 21, 23, 25, 29, 34, 36, 38, 39, 40, 42, 45, 48, 56, 69, 78, 79, 80, 82, 86, 89, 94};
        int target = 29;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]) {
            start = end;
            end = end * 2;
        }
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid -1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
