// generics/RandomList.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomList<T> extends ArrayList<T> {
    private Random rand = new Random(47);

    public T select() {
        return get(rand.nextInt(size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        Arrays.stream(
                ("The quick brown fox jumped over " +
                        "the lazy brown dog").split(" "))
                .forEach(rs::add);
        IntStream.range(0, 11).forEach(i ->
                System.out.print(i + "++" + rs.select() + " "));

        RandomList<String> rs1 = new RandomList<>();
        Arrays.stream(
                ("The quick brown fox jumped over " +
                        "the lazy brown dog").split(" "))
                .forEach(rs1::add);
        System.out.println();
        for (int i = 0; i < 11; i++) {
            System.out.print(i + "++" + rs1.select() + " ");
        }
    }
}
/* Output:
brown over fox quick quick dog brown The brown lazy
brown
*/
