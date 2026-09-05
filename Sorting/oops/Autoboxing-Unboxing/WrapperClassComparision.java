
public class WrapperClassComparision {
    public static void main(String[] args) {
        /*
        == compare reference address

        int a = 100;
        int b = 100;
        System.out.println(a == b);
        */

        /*
        Integer x = same value
        Integer y = same value

          ↓
        Is value between -128 and 127?
          ↓
        YES → usually same cached object → == true
        NO  → usually different objects → == false

        Better way is to use .equals()

        It will print true

        Integer x = 100;
        Integer y = 100;
        System.out.println(x == y); ==> true

        It is false

        Integer i = 200;
        Integer j = 200;
        System.out.println(i == j); ==> false

        a == b // ==> it means I m asking is both a and b reference variable are pointing to same reference 

        Concept: Java mein Integer ke liye ek Integer Cache hota hai, jisme generally -128 se 127 tak ke Integer objects pehle se available/reuse kiye jaate hain. Jab hum Integer x = 100 aur Integer y = 100 likhte hain, toh Java naye-naye objects banane ke bajay cache mein already present same 100 object ko reuse karta hai. Isliye x aur y dono reference variables same object ko point karte hain, aur x == y true deta hai, kyunki == objects ke case mein reference compare karta hai. Lekin 128 jaise cache range ke bahar values ke liye generally alag objects ban sakte hain, isliye == false de sakta hai.
        */

       
        Integer i = 200;
        Integer j = 200;
        System.out.println(i == j); // False

        Integer c = 200;
        Integer d = 200;
        System.out.println(c.intValue() == d.intValue() ); // ==> true : exact value is compared not reference method

        Integer a = 200;
        Integer b = 200;
        System.out.println(a.equals(b) ); // True ==> exact values is compared more easy way to compare two obj


    }    
}
