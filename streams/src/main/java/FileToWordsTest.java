// streams/FileToWordsTest.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

public class FileToWordsTest {
    public static void
    main(String[] args) throws Exception {
        FileToWords.stream("streams/src/main/java/Cheese.dat")
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();
        FileToWords.stream("streams/src/main/java/Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));
    }
}
/* Output:
Not much of a cheese shop really
is it
*/
