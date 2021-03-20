// exceptions/StreamsAreAutoCloseable.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamsAreAutoCloseable {
    public static void
    main(String[] args) throws IOException {
        try (
                Stream<String> in = Files.lines(
                        Paths.get("exceptions/src/main/java/StreamsAreAutoCloseable.java"));
                PrintWriter outfile = new PrintWriter(
                        "exceptions/src/main/java/Results.txt"); // [1]
        ) {
            in.skip(5)
                    .limit(1)
                    .map(String::toLowerCase)
                    .forEachOrdered(outfile::println);
        } // [2]
    }
}
