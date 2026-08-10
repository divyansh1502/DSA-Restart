public class evenOdd {
    public static void main(String[] args) {
        int[] arr = {12, 23, 25, 36, 48, 23, 54, 64, 32, 15, 7};;
        countEvenOdd(arr);
    }
    static void countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for(int num : arr) {
            if(num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Odd Numbers: " + odd);
        System.out.println("Even Numbers: " + even);
    }
}
