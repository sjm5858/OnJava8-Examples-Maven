// streams/SortedComparator.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.Comparator;

public class SortedComparator {
    public static void
    main(String[] args) throws Exception {
        FileToWords.stream("streams/src/main/java/Cheese.dat")
                .skip(10)
                .limit(10)
//                .sorted(Comparator.reverseOrder())
//                .sorted(Comparator.naturalOrder())
                .sorted()
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
/* Output:
you what to the that sir leads in district And
*/
