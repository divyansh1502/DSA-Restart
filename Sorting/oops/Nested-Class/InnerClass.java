public class InnerClass {

    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();

        inner.fun();

        inner.fun2();

        Outer.Inner.fun2();

        // Outer.Inner inner = new Outer().new Inner(); // ==> we use this way of object creation when we don't need Outer object.

    }

}

class Outer {

    int x = 10;

    class Inner {

        int x = 20;

        void fun() {

            System.out.println("Hello");

            System.out.println(x);

            System.out.println(Outer.this.x);

        }

        static void fun2() {

            System.out.println("Hello");

        }

        //Java 16: Before java 16 we cannot create static method inside nested inner class but now we can

    }

}
/*
USECASE:-
========

1. When the inner object logically belongs to a specific outer object.
   Example: Car → Engine, University → Department.

2. When the inner class needs direct access to the outer object's instance data.
   Example: accessing Outer.this.x.

3. Encapsulation — when a helper class is meaningful only within the outer class
   and needs access to its internal/private members.



Static Nested Class
        ↓
Does NOT need Outer object
        ↓
Outer.Inner obj = new Outer.Inner();


Non-Static Inner Class
        ↓
NEEDS Outer object
        ↓
Outer outer = new Outer();
Outer.Inner obj = outer.new Inner();
*/