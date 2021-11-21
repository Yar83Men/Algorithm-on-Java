package com.javapoint.algorithm;

import java.util.ArrayList;

public class StringSearch {
    public static void main(String[] args) {
        String text = "aabaabaaaaaaabaabaabaabbaaab";
        String s = "aabaab";
        System.out.println(search(text, s));

    }

    static ArrayList<Integer> search(String text, String s) {
        ArrayList<Integer> foundPositions = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            int k = 0;
            while (k < s.length() && i + k < text.length() && s.charAt(k) == text.charAt(i+k)) {
                k++;
            }
            if (k == s.length()){
                foundPositions.add(i);
            }
        }
        return foundPositions;
    }
}