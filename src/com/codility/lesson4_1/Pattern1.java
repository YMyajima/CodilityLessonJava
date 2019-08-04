package com.codility.lesson4_1;

public class Pattern1 implements SolutionInterface {

    @Override
    public int solution(int[] A) {
        int length = A.length;
        int[] a = new int[A.length];
        for (int i = 0; i < length; i++) {
            if (A[i] > length) {
                return 0;
            }
            if (a[A[i]-1] == 1) {
                return 0;
            }
            a[A[i]-1]++;
        }
        return 1;
    }
}
