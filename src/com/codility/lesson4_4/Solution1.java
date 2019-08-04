package com.codility.lesson4_4;


import java.util.Arrays;

/**
 * MissingInteger
 * 22%.
 * 穴あきの正数が2つ以上の場合に対応できていなかった。
 */
class Solution1 implements SolutionInterface {

    @Override
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int current = 0;
        int max = 1;
        long sum = 0;
        for (int a : A) {
            if (max < a) {
                max = a;
            }
            if (a > 0) {
                if (current == a) {
                    // 同じ値の場合はカウントを進めない
                    // 合計値に加算しないようにskipする
                    continue;
                } else {
                    current++;
                }
                // 1以上の数値をすべて足す
                sum += a;
            }
        }
        long expectSum = max * (max + 1) / 2;
        long ans = expectSum - sum;
        if (ans == 0) {
            // expectSum == sum
            return max + 1;
        } else if (ans > 0) {
            return (int) ans;
        }
        return 1;
    }
}
