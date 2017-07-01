package org.test;

import org.junit.Test;

public class SimpleMapTest {

    @Test
    public void test() throws Exception {
        SimpleMap<A, String> m1 = new SimpleMap<>();
        m1.put(new B(), "a");
        handle(m1);

        SimpleMap<B, String> m2 = new SimpleMap<>();
        m2.put(new B(), "a");
        handle(m2);
    }

    private static void handle(SimpleMap<? extends A, String> m) {
        m.get(null);
        m.get(new A())
        m.get(new B());
    }

    private static class A {

    }

    private static class B extends A {

    }
}
