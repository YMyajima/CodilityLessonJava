package com.codility;


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

public class Lesson2 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {9, 3, 9, 3, 9, 7, 7, 8, 9};
        System.out.println(solution.solution(A));
    }
}
