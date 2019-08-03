package com.codility.lesson2_1;

class Solution {
    /**
     * 偶数の一致する数値があり、一つのユニークな値がある場合に有効な方法。
     * 一致する値が奇数存在する場合、正しい答えは出ない。
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 1) {
            return A[0];
        }
        int result = 0;
        for (int a : A) {
            result ^= a;
        }
        return result;
    }
}
