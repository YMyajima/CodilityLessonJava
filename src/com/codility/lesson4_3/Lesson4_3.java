package com.codility.lesson4_3;

import sun.jvm.hotspot.utilities.Assert;

import java.util.Arrays;

public class Lesson4_3 {

    enum Test {
        a(new int[]{3, 4, 4, 6, 1, 4, 4}, 5, new int[]{3, 2, 2, 4, 2}),
        b(new int[]{3, 4, 4, 6, 1, 4, 4, 6}, 5, new int[]{4, 4, 4, 4, 4}),
        c(new int[]{6, 6, 6, 6, 6}, 5, new int[]{0, 0, 0, 0, 0}),
        d(new int[]{1}, 2, new int[]{1, 0}),

        ;

        int[] A;
        int N;
        int[] expect;

        Test(int[] a, int n, int[] expect) {
            A = a;
            N = n;
            this.expect = expect;
        }
    }

    public static void main(String[] args) {
        Test[] values = Test.values();
        for (Test test : values) {
            int[] result = new Solution2().solution(test.N, test.A);
            System.out.println(Arrays.toString(result));
            Assert.that(Arrays.equals(result, test.expect), "");
        }
    }
}
