package com.codility.lesson5_1;



/**
 * PassingCars
 * 100%
 * O(N)
 */
class Solution1 implements SolutionInterface {

    private final int TO_EAST = 0;
    private final int TO_WEST = 1;
    private final long MAX_PASS = 1000000000;

    @Override
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] counter = {0, 0};
        long passCount = 0;

        int length = A.length;
        for (int i = 0; i < length; i++) {
            if (passCount > MAX_PASS) {
                return -1;
            }
            if (counter[TO_EAST] > 0) {
                // P < Qの制限により、eastが一回以上出たときが条件
                if (A[i] == TO_WEST) {
                    // westが出たら、これまでのpassCountとeastの数を足す。
                    passCount += counter[TO_EAST];
                } else {
                    counter[TO_EAST]++;
                }
            } else {
                counter[A[i]]++;
            }
        }
        return (int) passCount;
    }
}
