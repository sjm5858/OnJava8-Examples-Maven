// polymorphism/Sandwich.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Order of constructor calls
// {java polymorphism.Sandwich}
package polymorphism;

import java.awt.print.PrinterAbortException;

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    private int a = 9;

    public int getA() {
        return a;
    }

    PortableLunch() {
        System.out.println("PortableLunch()");
    }

}

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        System.out.println("Sandwich()");
    }
    public static void test(){
        System.out.println("test");
    }
    public int getA(){
        return super.getA();
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
//        Sandwich.a;
        Sandwich.test();
    }
}
/* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
*/
