package com.codility.lesson3_3;


class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long sum = 0;
        for (int a : A) {
            sum += a;
        }
        long result = 9999;
        long leftValue = A[0];
        for (int p = 1; p < A.length; p++) {
            long rightValue = sum - leftValue;
            long tmpResult = Math.abs(leftValue - rightValue);
            if (result > tmpResult) {
                result = tmpResult;
            }
            leftValue += A[p];
        }
        return (int) result;
    }
}
