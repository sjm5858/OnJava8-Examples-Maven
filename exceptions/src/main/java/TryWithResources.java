// exceptions/TryWithResources.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
    public static void main(String[] args) {
        try (
                InputStream in = new FileInputStream(
                        new File("exceptions/src/main/java/TryWithResources.java"))
        ) {
            int contents = in.read();
            // Process contents
        } catch (IOException e) {
            // Handle the error
        }
    }
}
