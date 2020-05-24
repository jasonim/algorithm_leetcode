package com.jason.algorithm.leetcode;

/**
 * Created by jsson on 20/2/23.
 * 3. Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.

 Example 1:

 Input: "abcabcbb"
 Output: 3
 Explanation: The answer is "abc", with the length of 3.
 Example 2:

 Input: "bbbbb"
 Output: 1
 Explanation: The answer is "b", with the length of 1.
 Example 3:

 Input: "pwwkew"
 Output: 3
 Explanation: The answer is "wke", with the length of 3.
 Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int freq[] = new int[256];
        int l = 0;
        int r = -1;
        int res =0;
        while (l < s.length()) {
            if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0) {
                r++;
                freq[s.charAt(r)]++;
            } else {
                freq[s.charAt(l++)] --;
            }

            res = Math.max(res, r-l+1);
        }

        return res;
    }
}
