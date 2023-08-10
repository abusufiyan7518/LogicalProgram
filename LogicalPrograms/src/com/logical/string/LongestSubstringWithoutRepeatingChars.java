package com.logical.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndex = new HashMap<>();
        int start = 0;
        int maxLen = 0;
String string="dbdhbd";
System.out.println(string.substring(0, 2));



        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
         
            if (charIndex.containsKey(c) && charIndex.get(c) >= start) {
                start = charIndex.get(c) + 1;
            }
            charIndex.put(c, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String[] testStrings = {"abcabcbb", "bbbbb", "pwwkew"};
        for (String string : testStrings) {
            int result = lengthOfLongestSubstring(string);
            System.out.println("Input: '" + string + "', Output: " + result);
        }
    }
}
