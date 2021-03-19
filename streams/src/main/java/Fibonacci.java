// streams/Fibonacci.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.stream.Stream;

public class Fibonacci {
    static int a;
    int x = 1;

    Stream<Integer> numbers() {
        return Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        new Fibonacci().numbers()
                .skip(20) // Don't use the first 20
                .limit(10) // Then take 10 of them
                .forEach(System.out::println);
        System.out.println("==================");
        Stream.iterate(1, i -> {
            a++;
            return i * 2;
        })
                .map(i -> String.format("2的%d次方是%12d",a,i))
                .skip(1)
                .limit(30)
                .forEach(System.out::println);
    }
}
/* Output:
6765
10946
17711
28657
46368
75025
121393
196418
317811
514229
*/
