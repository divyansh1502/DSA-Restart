public class finalKeyword {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI_VALUE);
    }
}
class Random {
    final double PI_VALUE;

    Random() {
        this.PI_VALUE = 3.14;
    }
}
