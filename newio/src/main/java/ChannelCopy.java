// newio/ChannelCopy.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Copying a file using channels and buffers
// {java ChannelCopy ChannelCopy.java test.txt}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collections;

public class ChannelCopy {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        args = new String[]{
                "newio/src/main/java/ChannelCopy.java",
                "newio/src/main/java/files/test.txt "
        };

        if (args.length != 2) {
            System.out.println(
                    "arguments: sourcefile destfile");
            System.exit(1);
        }
        try (
                FileChannel in = new FileInputStream(
                        args[0]).getChannel();
                FileChannel out = new FileOutputStream(
                        args[1]).getChannel()
        ) {
            ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
            while (in.read(buffer) != -1) {
                buffer.flip(); // Prepare for writing
                out.write(buffer);
                buffer.clear();  // Prepare for reading
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
