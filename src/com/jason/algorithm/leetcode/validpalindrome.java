package com.jason.algorithm.leetcode;

/**
 * Created by jsson on 20/2/23.
 *
 * 125. Valid Palindrome
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 Note: For the purpose of this problem, we define empty string as valid palindrome.

 Example 1:

 Input: "A man, a plan, a canal: Panama"
 Output: true
 Example 2:

 Input: "race a car"
 Output: false
 */
public class validpalindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        while(i < j) {
            if (invaild(s.charAt(i))) {
                i++;

            } else if (invaild(s.charAt(j))) {
                j--;
            } else if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
            } else {
               return false;
            }

        }

        return true;
    }

    private boolean invaild(char c) {
        return !Character.isLetterOrDigit(c);
    }
}
