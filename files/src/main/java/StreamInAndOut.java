// files/StreamInAndOut.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamInAndOut {
    public static void main(String[] args) {
        try (
                Stream<String> input =
                        Files.lines(Paths.get("files/src/main/java/StreamInAndOut.java"));
                PrintWriter output =
                        new PrintWriter("files/src/main/java/files/StreamInAndOut.txt")
        ) {
            input.
                    map(String::toUpperCase).
                    forEachOrdered(output::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
