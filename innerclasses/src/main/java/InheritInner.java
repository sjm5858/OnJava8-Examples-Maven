// innerclasses/InheritInner.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Inheriting an inner class

class WithInner {
    class Inner {
        private int a;

        public Inner(int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }
    }
}

public class InheritInner extends WithInner.Inner {
//     InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super(1);
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
        System.out.println(ii.getA());
    }
}
