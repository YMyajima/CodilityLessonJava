package com.codility.lesson4_3;


/**
 * 100%.
 * performance.
 * arraycopy < new int[N] < [].clone()
 */
public class Solution2 implements SolutionInterface {

    @Override
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int max = 0;
        int base = 0;
        int[] zeroArray = new int[N];
        int[] counter = new int[N];
        for (int a : A) {
            if (a == N + 1) {
                base = base + max;
                max = 0;
                System.arraycopy(zeroArray, 0, counter, 0, N);
            } else {
                counter[a-1]++;
                if (max < counter[a-1]) {
                    max = counter[a-1];
                }
            }
        }
        for (int i = 0; i < counter.length; i++) {
            counter[i] = counter[i] + base;
        }
        return counter;
    }
}
