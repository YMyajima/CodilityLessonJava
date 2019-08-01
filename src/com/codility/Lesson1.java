package com.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson1 {
    public static int solution(int N) {
        // write your code in Java SE 8
        String s = Integer.toBinaryString(N);
        System.out.println(s);
        String s1 = s.replaceAll("0+$", "");
        System.out.println(s1);
        String[] binaries = s1.split("1");
        System.out.println(Arrays.toString(binaries));
        List<Integer> lengths = new ArrayList<>();
        for (String binary : binaries) {
            lengths.add(binary.length());
        }
        System.out.println(lengths);
        if (lengths.size() == 0) {
            return 0;
        }
        Integer max = Collections.max(lengths);
        return max;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(solution(15));
        System.out.println(solution(32));
    }
}
