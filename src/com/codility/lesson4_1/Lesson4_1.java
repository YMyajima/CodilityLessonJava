package com.codility.lesson4_1;

import sun.jvm.hotspot.utilities.Assert;


public class Lesson4_1 {

    enum Test {
        a(new int[]{4, 1, 3, 2}, 1),
        b(new int[]{4, 1, 3}, 0),
        c(new int[]{2}, 0),
        d(new int[]{1, 2,999999997, 999999998, 999999999, 100000000}, 0),
        e(new int[]{9, 5, 7, 3, 2, 7, 3, 1, 10, 8}, 0),

        ;

        int[] A;
        int expect;

        Test(int[] a, int expect) {
            A = a;
            this.expect = expect;
        }
    }

    public static void main(String[] args) {
        Test[] values = Test.values();
        for (Test test : values) {
            int result1 = new Pattern1().solution(test.A);
            int result2 = new Pattern2().solution(test.A);
            Assert.that(test.expect == result1, "result1");
            Assert.that(test.expect == result2, "result2");
        }
    }
}
