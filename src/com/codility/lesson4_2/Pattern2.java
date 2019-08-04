package com.codility.lesson4_2;

import java.util.Arrays;

public class Pattern2 implements SolutionInterface {

    @Override
    public int solution(int X, int[] A) {
        int[] a = new int[X];
        int expectSum = X * (X + 1) / 2;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i]-1 > X) {
                continue;
            }
            if (a[A[i]-1] == 0) {
                a[A[i]-1] = 1;
                sum += A[i];
                if (sum == expectSum) {
                    return i;
                }
            }
        }
        if (sum != expectSum) {
            return -1;
        }
        return -1;
    }
}
