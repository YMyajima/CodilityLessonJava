package com.codility.lesson2_2;

import sun.jvm.hotspot.utilities.Assert;

import java.util.Arrays;

public class Lesson2_2 {

    enum Test {
        a(new int[]{3, 8, 9, 7, 6}, 3, new int[]{9, 7, 6, 3, 8}),
        b(new int[]{0, 0, 0}, 3, new int[]{0, 0, 0}),
        c(new int[]{1, 2, 3}, 2, new int[]{2, 3, 1}),
        d(new int[]{}, 0, new int[]{}),

        ;

        int[] A;
        int K;
        int[] expect;

        Test(int[] a, int k, int[] expect) {
            A = a;
            K = k;
            this.expect = expect;
        }
    }

    public static void main(String[] args) {
        Test[] values = Test.values();
        for (Test test : values) {
            int[] result = new Solution().solution(test.A, test.K);
            Assert.that(Arrays.equals(test.expect, result), "");
        }
    }
}
