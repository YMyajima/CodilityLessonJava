package com.codility.lesson3_2;


class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return 1;
        }
        long max = 1;
        long sum = 0;
        for (int a : A) {
            if (max < a) {
                max = a;
            }
            sum += a;
        }
        long expectSum = max * (max+1) / 2;
        long missingNumber = expectSum - sum;
        if (missingNumber == 0) {
            return (int) max + 1;
        }
        return (int) (expectSum - sum);
    }
}