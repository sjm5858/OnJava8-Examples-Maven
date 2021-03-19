// streams/Machine2.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import onjava.Operations;

import java.util.Arrays;

public class Machine2 {
    private static void show(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        Arrays.stream(new Operations[]{
                () -> Machine2.show("SJM"),
                () -> Machine2.show("666"),
                () -> Operations.show("Bing"),
                () -> Operations.show("Crack"),
                () -> Operations.show("Twist"),
                () -> Operations.show("Pop")
        }).forEach(Operations::execute);
    }
}
/* Output:
Bing
Crack
Twist
Pop
*/
