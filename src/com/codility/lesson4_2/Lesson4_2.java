package com.codility.lesson4_2;

import sun.jvm.hotspot.utilities.Assert;

public class Lesson4_2 {

    enum Test {
        a(new int[]{1, 3, 1, 4, 2, 3, 5, 4}, 5, 6),
        b(new int[]{1}, 1, 0),
        c(new int[]{2, 2, 2, 2, 2}, 2, -1),

        ;

        int[] A;
        int X;
        int expect;

        Test(int[] a, int x, int expect) {
            A = a;
            X = x;
            this.expect = expect;
        }
    }

    public static void main(String[] args) {
        Test[] values = Test.values();
        for (Test test : values) {
            int result = new Pattern2().solution(test.X, test.A);
            System.out.println(result);
            Assert.that(test.expect == result, "");
        }
    }
}
