// annotations/AUExternalTest.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Creating non-embedded tests
// {java onjava.atunit.AtUnit
// build/classes/main/annotations/AUExternalTest.class}
package onjava.atunit;

public class
AUExternalTest extends AtUnitExample1 {
    @Test
    boolean tMethodOne() {
        return methodOne().equals("This is methodOne");
    }

    @Test
    boolean tMethodTwo() {
        return methodTwo() == 2;
    }
}
/* Output:
annotations.AUExternalTest
  . tMethodOne
  . tMethodTwo This is methodTwo

OK (2 tests)
*/
