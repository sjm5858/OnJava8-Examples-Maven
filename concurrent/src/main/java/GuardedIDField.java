// concurrent/GuardedIDField.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.concurrent.atomic.AtomicInteger;

public class GuardedIDField implements HasID {
    private static AtomicInteger counter =
            new AtomicInteger();
    private int id = counter.getAndIncrement();

    @Override
    public int getID() {
        return id;
    }

    public static void main(String[] args) {
        IDChecker.test(GuardedIDField::new);
    }
}
/* Output:
0
*/
