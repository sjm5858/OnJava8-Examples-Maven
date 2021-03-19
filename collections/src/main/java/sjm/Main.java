package sjm;

/**
 * Why class Node in LinkedList defined as static but not normal class
 * 为什么链表中的节点类定义为静态而不是普通类
 * https://stackoverflow.com/questions/41438392/why-class-node-in-linkedlist-defined-as-static-but-not-normal-class
 *
 * @author sjm5858
 * @date 2021/3/17 9:41
 */
public class Main {

    private String aField = "test";

    public static void main(String... args) {

        StaticExample x1 = new StaticExample();
        System.out.println(x1.getField());

        //does not compile:
        // NonStaticExample x2 = new NonStaticExample();

        Main m1 = new Main();
        NonStaticExample x2 = m1.new NonStaticExample();
        System.out.println(x2.getField());

    }


    private static class StaticExample {

        String getField() {
            //does not compile
//            return aField;
            return null;
        }
    }

    private class NonStaticExample {
        String getField() {
            return aField;
        }
    }
}
