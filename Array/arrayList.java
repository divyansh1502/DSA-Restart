import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(67);
        // list.add(669);
        // list.add(01);
        // list.add(13);
        // list.add(24);
        // list.add(78);
         //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list.contains(669));

        list.set(0, 99);

        list.remove(2);

       //interview HCL

        System.out.println(list);
    }
}
