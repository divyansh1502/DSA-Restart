public class LC268 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 2};
        
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
