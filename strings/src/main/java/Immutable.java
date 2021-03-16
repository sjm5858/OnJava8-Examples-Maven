// strings/Immutable.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

public class Immutable {
    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q); // howdy
        String qq = upcase(q);
        System.out.println(qq); // HOWDY
        System.out.println(q); // howdy

        String s = "asdf";
        String x = Immutable.upcase(s);
        System.out.println(s);
        System.out.println(x);
    }
}
/* Output:
howdy
HOWDY
howdy
*/
