package com.interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i = 0, j = 0;
        Set<Character> characters = new HashSet<>();

        while (j < s.length()) {
            if (!characters.contains(s.charAt(j))) {
                characters.add(s.charAt(j));
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            } else {
                characters.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int length = lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring: " + length);
    }
}
