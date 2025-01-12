// iostreams/TestEOF.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Testing for end of file
// {VisuallyInspectOutput}

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestEOF {
    public static void main(String[] args) {
        try (
                DataInputStream in = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream("TestEOF.java")))
        ) {
            while (in.available() != 0) {
                System.out.write(in.readByte());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
