package com.codility.lesson3_3;

import sun.jvm.hotspot.utilities.Assert;

public class Lesson3_3 {

    enum Test {
        a(new int[]{3, 1, 2, 4, 3}, 1),
        b(new int[]{3, 1}, 2),
        c(new int[]{3, 1, 2}, 0),

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
