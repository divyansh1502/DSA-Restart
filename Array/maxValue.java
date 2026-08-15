public class maxValue {
    public static void main(String[] args) {
        int[] arr = {71, 26, 93, 84, 55, 64};

        int maximum = max(arr);

        System.out.print("Max Value in Array is: " + maximum);
    }
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
