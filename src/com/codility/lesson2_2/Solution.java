package com.codility.lesson2_2;

import java.util.Arrays;

class Solution {
    private int nextIndex(int aLength, int rotateCount, int targetIndex) {
        int tmp = targetIndex + rotateCount;
        int nextIndex = tmp % aLength;
        return nextIndex;
    }

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        System.out.println(Arrays.toString(A));
        int L = A.length;
        if (L == 0) {
            return A;
        }
        int rotateCount = K % L;
        if (rotateCount == 0) {
            return A;
        }
        int[] result = new int[A.length];
        int aLength = A.length;
        for (int i = 0; i < aLength; i++) {
            int nextIndex = nextIndex(aLength, rotateCount, i);
            result[nextIndex] = A[i];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}