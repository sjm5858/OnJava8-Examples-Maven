// typeinfo/ClassCasts.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

class Building {
}

class House extends Building {
}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        System.out.println(h);
        h = (House) b; // ... or just do this.
        System.out.println(h);
    }
}
