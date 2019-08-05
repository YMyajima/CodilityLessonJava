package com.codility.lesson5_1;

import com.codility.lesson4_4.Solution3;
import sun.jvm.hotspot.utilities.Assert;


public class Lesson4_3 {

    enum Test {
        a(new int[]{0, 1, 0, 1, 1}, 5),
        b(new int[]{0}, 0),
        c(new int[]{1}, 0),
        d(new int[]{0, 1}, 1),
        e(new int[]{1, 0}, 0),
        f(new int[]{0, 0, 0, 0, 0}, 0),
        g(new int[]{1, 1, 1, 1, 1}, 0),
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
            int result = new Solution1().solution(test.A);
            System.out.println(result);
            Assert.that(result == test.expect, "");
        }
    }
}
