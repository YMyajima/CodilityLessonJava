package com.codility.lesson4_1;


import java.util.Arrays;

class Pattern2 implements SolutionInterface {

    @Override
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                return 0;
            }
        }
        return 1;
    }
}
