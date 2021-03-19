// functional/CurriedIntAdd.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class CurriedIntAdd {
    public static void main(String[] args) {
        IntFunction<IntUnaryOperator>
                curriedIntAdd = a -> b -> a + b;

        IntFunction<IntUnaryOperator>
                curriedIntAdd2 = new IntFunction<IntUnaryOperator>() {
            @Override
            public IntUnaryOperator apply(int a) {
                return new IntUnaryOperator() {
                    @Override
                    public int applyAsInt(int b) {
                        return a + b;
                    }
                };
            }
        };

        IntFunction<IntUnaryOperator>
                curriedIntAdd3 = a -> (IntUnaryOperator) b -> a + b;

        IntUnaryOperator add4 = curriedIntAdd3.apply(4);
        System.out.println(add4.applyAsInt(5));
    }
}
/* Output:
9
*/
