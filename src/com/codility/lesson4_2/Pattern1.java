package com.codility.lesson4_2;


class Pattern1 implements SolutionInterface {

    /**
     * wrong answer.
     * Xの位置に落ちる葉が一番はやい時間を調べていた。
     * 目的の位置に落ちる葉に対してジャンプするのが一番はやい時間は？と読み間違えた。
     * @param X
     * @param A
     * @return
     */
    @Override
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int length = A.length;
        for (int i = 0; i < length; i++) {
            if (A[i] == X) {
                return i;
            }
        }
        return -1;
    }
}