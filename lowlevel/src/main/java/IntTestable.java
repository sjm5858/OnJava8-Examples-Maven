// lowlevel/IntTestable.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.function.IntSupplier;

public abstract class
IntTestable implements Runnable, IntSupplier {
    abstract void evenIncrement();

    @Override
    public void run() {
        while (true) {
            evenIncrement();
        }
    }
}
