// files/ListOfLines.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.nio.file.Files;
import java.nio.file.Paths;

public class ListOfLines {
    public static void
    main(String[] args) throws Exception {
        Files.readAllLines(
                Paths.get("streams/src/main/java/Cheese.dat"))
                .stream()
                .filter(line -> !line.startsWith("//"))
                .map(line ->
                        line.substring(0, line.length() / 2))
                .forEach(System.out::println);
    }
}
/* Output:
Not much of a cheese
Finest in the
And what leads you
Well, it's
It's certainly uncon
*/
