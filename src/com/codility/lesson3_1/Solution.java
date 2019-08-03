package com.codility.lesson3_1;


class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int actualDistance = Y - X;
        if (actualDistance == 0) {
            return 0;
        }
        int jumpNum = actualDistance / D;
        if (actualDistance % D != 0) {
            return jumpNum + 1;
        }
        return jumpNum;
    }
}