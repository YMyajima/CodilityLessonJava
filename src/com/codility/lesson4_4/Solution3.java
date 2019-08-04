package com.codility.lesson4_4;

import java.util.HashSet;

/**
 * MissingInteger
 * 100%
 * O(N) or O(N * log(N))
 * HashSetを使って重複を削除
 */
public class Solution3 implements SolutionInterface {

    @Override
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        // iの範囲は条件の値を参考に決める。
        for (int i = 1; i <= 1000001; i++) {
            if (set.contains(i)) {
                continue;
            } else {
                return i;
            }
        }
        return 1;
    }
}
