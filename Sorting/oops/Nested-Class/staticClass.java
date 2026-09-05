public class staticClass {

    public static void main(String[] args) {

        // Creating an object of the Outer class
        Outer outer = new Outer();

        /*
         * Inner is a STATIC nested class.
         *
         * Because Inner is static, we do NOT need an object
         * of Outer to create an Inner object.
         *
         * Syntax:
         * Outer.Inner inner = new Outer.Inner();
         *
         * In our example, however, Inner has been designed to
         * receive an Outer object through its constructor so that
         * it can access the non-static members of Outer.
         */
        Outer.Inner inner = new Outer.Inner(outer);

        inner.print();


        /*
         * BankAccount.calculateYearly() is a static method.
         *
         * The actual calculation is delegated to the private
         * static nested class ComputeInterest.
         *
         * This hides the implementation/helper class from
         * outside code.
         */
        System.out.println(
                BankAccount.calculateYearly(10000, 0.06)
        );
    }
}


class Outer {

    // Static variable belongs to the Outer class, not to an object.
    private static int x = 4;

    // Non-static variable belongs to an object of Outer.
    int y;


    /*
     * STATIC NESTED CLASS
     *
     * Inner is a static nested class.
     *
     * It belongs to the Outer class itself rather than to an
     * object of Outer.
     *
     * Therefore, it can be created without creating an Outer object:
     *
     * Outer.Inner obj = new Outer.Inner();
     *
     * A static nested class can directly access ONLY the
     * static members of the outer class.
     *
     * It cannot directly access non-static members of Outer
     * because non-static members require an Outer object.
     */
    static class Inner {

        /*
         * Reference to an Outer object.
         *
         * This is NOT automatically provided by Java.
         * We explicitly store an Outer object so that Inner
         * can access its non-static members.
         */
        Outer outer;


        // Static variable belonging to Inner class.
        private static int y = 5;


        // Constructor of the static nested class.
        Inner(Outer outer) {
            this.outer = outer;
        }


        void print() {

            /*
             * x is static in Outer.
             *
             * Therefore, Inner can directly access it.
             */
            System.out.println(x);


            /*
             * outer.y is possible because we have an
             * Outer object reference.
             *
             * y itself is non-static, so we need an object
             * of Outer to access it.
             */
            System.out.println(outer.y);
        }


        /*
         * A static nested class can contain static methods.
         *
         * This method can be called as:
         *
         * Outer.Inner.print2();
         */
        static void print2() {
        }
    }
}


class BankAccount {

    /*
     * PRIVATE STATIC NESTED CLASS
     *
     * ComputeInterest is only an implementation/helper class
     * required by BankAccount.
     *
     * Since it is private, classes outside BankAccount
     * cannot directly access it.
     *
     * Since it doesn't need an object of BankAccount,
     * making it static is appropriate.
     */
    private static class ComputeInterest {

        static double calculateYearly(double principal, double rate) {
            return principal * rate;
        }
    }


    /*
     * Public/package-level API of BankAccount.
     *
     * The caller only needs to know about BankAccount.
     * It doesn't need to know that ComputeInterest exists.
     */
    static double calculateYearly(double principal, double rate) {

        return ComputeInterest.calculateYearly(principal, rate);
    }
}
// Use Case 1: Used as a helper class when the helper is logically related to the outer class.

// Use Case 2: Commonly used for implementing the Builder Design Pattern.

// Use Case 3: Used when we want to define static methods inside a nested class.

// Use Case 4: Used to group related Request/Response DTOs inside an outer class.

// Use Case 5: Used to hide implementation/helper classes using private static nested classes.

// Use Case 6: Used to logically group classes that are strongly related to the outer class.

// Use Case 7: Used for grouping constants or related utility functionality within an outer class.

// Property 1: A static nested class belongs to the outer class, not to an object of the outer class.

// Property 2: It can be created without creating an object of the outer class.

// Property 3: It can directly access only static members of the outer class.

// Property 4: It cannot directly access non-static members of the outer class.

// Property 5: It can have both static and non-static fields and methods.

// Property 6: It can have constructors like a normal class.

// Property 7: It can have any access modifier such as private, protected, public, or default.

// Property 8: It does not have an automatic reference to an object of the outer class.

// Property 9: It can be accessed using the syntax `Outer.Inner`.

// Property 10: A static nested class can contain static methods, fields, and nested types.

// Property 11: It can access private static members of the outer class.

// Property 12: It can be instantiated multiple times, just like a normal class.