

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28, 56, 45, 73, 69};

        System.out.println(search(arr,56, 2, 6));
    }
    static boolean search(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return false;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i] == target) {
                return true;
            }
        }

        return false;
    }
}
