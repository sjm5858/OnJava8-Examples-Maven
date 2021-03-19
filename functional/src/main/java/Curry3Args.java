// functional/Curry3Args.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.function.Function;

public class Curry3Args {
    public static void main(String[] args) {
        Function<String,
                Function<String,
                        Function<String, String>>> sum =
                a -> b -> c -> a + b + c;

        Function<String,
                Function<String,
                        Function<String, String>>> sum2 = new Function<String, Function<String, Function<String, String>>>() {
            @Override
            public Function<String, Function<String, String>> apply(String a) {
                return new Function<String, Function<String, String>>() {
                    @Override
                    public Function<String, String> apply(String b) {
                        return new Function<String, String>() {
                            @Override
                            public String apply(String c) {
                                return a + b + c;
                            }
                        };
                    }
                };
            }
        };

        Function<String,
                Function<String,
                        Function<String, String>>> sum3 =
                a -> (Function<String, Function<String, String>>) b -> (Function<String, String>) c -> a + b + c;

        Function<String,
                Function<String, String>> hi =
                sum2.apply("Hi ");
        Function<String, String> ho =
                hi.apply("Ho ");
        System.out.println(ho.apply("Hup"));
    }
}
/* Output:
Hi Ho Hup
*/
