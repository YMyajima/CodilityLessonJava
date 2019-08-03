package com.codility.lesson3_1;

import sun.jvm.hotspot.utilities.Assert;

import java.util.Arrays;

public class Lesson3_1 {

    enum Test {
        a(10, 85, 30, 3),
        b(10, 10, 30, 0),
        c(10, 100, 45, 2),

        ;

        int X;
        int Y;
        int D;
        int expect;

        Test(int x, int y, int d, int expect) {
            X = x;
            Y = y;
            D = d;
            this.expect = expect;
        }
    }

    public static void main(String[] args) {
        Test[] values = Test.values();
        for (Test test : values) {
            int result = new Solution().solution(test.X, test.Y, test.D);
            System.out.println(result);
            Assert.that(test.expect == result, "");
        }
    }
}
