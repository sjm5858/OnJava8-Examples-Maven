// collectiontopics/Enumerations.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Java 1.0/1.1 Vector and Enumeration

import onjava.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Enumerations {
    public static void main(String[] args) {
        Vector<String> v =
                new Vector<>(Countries.names(10));
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + ", ");
        }
        // Produce an Enumeration from a Collection:
        e = Collections.enumeration(new ArrayList<>());
    }
}
/* Output:
ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO,
BURUNDI, CAMEROON, CAPE VERDE, CENTRAL AFRICAN
REPUBLIC, CHAD,
*/
