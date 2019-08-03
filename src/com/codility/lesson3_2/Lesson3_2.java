package com.codility.lesson3_2;

import sun.jvm.hotspot.utilities.Assert;

public class Lesson3_2 {

    enum Test {
        a(new int[]{1, 2, 3, 5}, 4),
        b(new int[]{1, 2, 3, 4, 6}, 5),
        c(new int[]{}, 1),
        d(new int[]{1, 2}, 3),
        e(new int[]{10, 8, 1, 2, 3, 5, 9, 4, 6}, 7),

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
            int result = new Solution().solution(test.A);
            System.out.println(result);
            Assert.that(test.expect == result, "");
        }
    }
}
