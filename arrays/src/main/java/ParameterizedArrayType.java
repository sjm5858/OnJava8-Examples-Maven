// arrays/ParameterizedArrayType.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import static onjava.ArrayShow.*;

class ClassParameter<T> {
    public T[] f(T[] arg) {
        return arg;
    }
}

class MethodParameter {
    public static <T> T[] f(T[] arg) {
        return arg;
    }
}

public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] ints2 =
                new ClassParameter<Integer>().f(ints);
        show(ints2);
        Double[] doubles2 =
                new ClassParameter<Double>().f(doubles);
        show(doubles2);
        ints2 = MethodParameter.f(ints);
        show(ints2);
        doubles2 = MethodParameter.f(doubles);
        show(doubles2);
    }
}
