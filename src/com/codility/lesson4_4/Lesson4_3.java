package com.codility.lesson4_4;

import sun.jvm.hotspot.utilities.Assert;


public class Lesson4_3 {

    enum Test {
        a(new int[]{1, 3, 6, 4, 1, 2}, 5),
        b(new int[]{1, 2, 3}, 4),
        c(new int[]{-1, -3}, 1),
        d(new int[]{-1, -3, 1, 3}, 2),
        e(new int[]{2, 3}, 1),
        f(new int[]{4, 5, 6, 2}, 1)
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
            int result = new Solution3().solution(test.A);
            System.out.println(result);
            Assert.that(result == test.expect, "");
        }
    }
}
