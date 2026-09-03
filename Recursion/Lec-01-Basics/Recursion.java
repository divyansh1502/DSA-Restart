
public class Recursion {
    public static void main(String[] args) {
        message(5);
    }
    static void message(int n) {
        if(n == 0) { // Base condition
            return;
        }
        message(n - 1); // recursive call
        System.out.println(n);
        return; 
    }
}
