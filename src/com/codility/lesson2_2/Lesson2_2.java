package com.codility.lesson2_2;

import java.util.Arrays;

public class Lesson2_2 {

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] result = new Solution().solution(A, K);
        System.out.println(Arrays.toString(result));
    }
}
