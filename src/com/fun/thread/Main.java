package com.fun.thread;

/**
 * Created by fun on 16/8/10.
 */
public class Main {


    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello, World");
        threadDemo();
    }


    private static void threadDemo() {
        TestTread t = new TestTread("入口一", TestTread.Type.FUNVAR);
        TestTread t1 = new TestTread("入口一", TestTread.Type.FUNVAR);
        TestTread t2 = new TestTread("入口一", TestTread.Type.FUNVAR);

        TestTread t3 = new TestTread("入口二", TestTread.Type.PROPERTY);
        TestTread t4 = new TestTread("入口二", TestTread.Type.PROPERTY);
        TestTread t5 = new TestTread("入口二", TestTread.Type.PROPERTY);

        TestTread t6 = new TestTread("入口三", TestTread.Type.Static);
        TestTread t7 = new TestTread("入口三", TestTread.Type.Static);
        TestTread t8 = new TestTread("入口三", TestTread.Type.Static);
        t.run();
        t1.run();
        t2.run();

        t3.run();
        t4.run();
        t5.run();

        t6.run();
        t7.run();
        t8.run();
    }

}
