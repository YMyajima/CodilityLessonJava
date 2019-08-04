package com.codility.lesson4_4;


import java.util.Arrays;


/**
 * MissingInteger
 * 100%
 * O(N) or O(N * log(N))
 */
class Solution2 implements SolutionInterface {

    @Override
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 0) {
                // 0以下はskipする
                continue;
            }
            if (counter == A[i]) {
                // 1, 1, 2といった同じ値の正数に対応
                continue;
            } else if (counter + 1 == A[i]) {
                // 一つ先の値が連続した正数ならカウントを加算する
                counter++;
            } else {
                // 1以上で、同値の数値でない、連続した数値でない場合
                // 一つ先の正数がない場合と同じ
                return counter+1;
            }
        }
        if (counter > 0) {
            // countが1以上の場合、全て連続した正数だった場合なので最後の値の+1を返す
            return counter+1;
        }
        // 正数がない場合は1
        return 1;
    }
}
